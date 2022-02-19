
import DAL.IRepo;
import DAL.RepoFactory;
import Model.CartItem;
import Model.Customer;
import Model.LogInfo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Util {
    public static float calculateTotalSum(List<CartItem> cartItems){
        float sum=0;
        if (cartItems!=null) {
            for (CartItem bagItem : cartItems) {
                sum+=bagItem.getProduct().getPrice()*bagItem.getQuantity();
            }
        }
        return sum;
    }
    public static void createLog(String username,HttpServletRequest request){
        String ipAdress=request.getRemoteAddr();
        String date=getTodaysDate();
        IRepo repo=RepoFactory.getRepo();
        int c=-1;
        for (Customer customer : repo.getAllCustomers()) {
            if (customer.getEmail().equals(username)) {
                c=customer.getIDCustomer();
            }
        }
        LogInfo logInfo=new LogInfo(c, date, ipAdress);
        try {
            repo.insertLogInfo(logInfo);
        } catch (Exception e) {
        }
    }
    public static boolean usernameUnique(String email){
        IRepo repo=RepoFactory.getRepo();
        
        List<Customer> customers=repo.getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }
    public static Customer getCustomerFromEmail(String emial){
        Customer c=null;
        IRepo repo=RepoFactory.getRepo();
        List<Customer> customers=repo.getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getEmail().equals(emial)) {
                return customer;
            }
        }
        c.setFirstName("ime");
        return c;
    }
        public static String getTodaysDate() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }
}
