/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Bill;
import Model.CartItem;
import Model.Category;
import Model.Customer;
import Model.Item;
import Model.LogInfo;
import Model.PaymentMethod;
import Model.Product;
import java.util.List;

/**
 *
 * @author User
 */
public interface IRepo {
    void insertCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomer(int id);
    boolean checkCustomer(String email, String password);
    
    List<Category> getAllCategory();
    
    List<Product> getAllProducts();
    Product getProduct(int id);
    
    List<PaymentMethod> getAllPaymentMethods();
    
    List<Bill> getAllBills();
    void insertBill(Bill bill, List<CartItem> cartItems);
    Bill getBill(int id);
    List<Bill> getBillsForCustomer(int id);
    
    List<Item> getItemsForBill(int id);
    void insertItem(Item i);
    
    List<LogInfo> getAllLogInfos();
    void insertLogInfo(LogInfo logInfo);
}
