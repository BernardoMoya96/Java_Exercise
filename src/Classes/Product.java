package Classes;

import java.util.LinkedList;

public class Product{

    private String product_id;
    private String name;
    private int quantity;
    private float price;
    private String category;
    private String available_stores;

    public Product(String product_id, String name, int quantity, float price, String category, String available_stores) {
        this.product_id = product_id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.available_stores = available_stores;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvailable_stores() {
        return available_stores;
    }

    public void setAvailable_stores(String available_stores) {
        this.available_stores = available_stores;
    }


    public String showProducts(){

        String productDetails = "Product id: "+product_id +"\n"+"Product name: "+category+"\n"+"Quantity: "+quantity+"\n"+"Price: "+price+"\n"+"Available locations:"+available_stores;
        return productDetails;

    }
}
