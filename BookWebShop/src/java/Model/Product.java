/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Product {
    private int IDProduct;
    private String Title;
    private float Price;
    private String Img;
    private int CategoryID;

    public Product(String Title, float Price, String Img, int CategoryID) {
        this.Title = Title;
        this.Price = Price;
        this.Img = Img;
        this.CategoryID = CategoryID;
    }

    public Product(int IDProduct, String Title, float Price, String Img, int CategoryID) {
        this.IDProduct = IDProduct;
        this.Title = Title;
        this.Price = Price;
        this.Img = Img;
        this.CategoryID = CategoryID;
    }

    public int getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(int IDProduct) {
        this.IDProduct = IDProduct;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    @Override
    public String toString() {
        return "Product{" + "Title=" + Title + ", Price=" + Price + ", Img=" + Img + ", CategoryID=" + CategoryID + '}';
    }
    
    
}
