package Classes;
import com.company.Main;

import java.util.LinkedList;
import java.util.Scanner;

public class Store{
    private String store_id;
    private String store_name;
private String store_location;

    public Store(String store_id, String store_name, String store_location) {
        this.store_id = store_id;
        this.store_name = store_name;
        this.store_location = store_location;
    }
    public Store(){

    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public String showStores(){

        String storeDetails = "Store_id: "+store_id +"\n"+"Store_name: "+store_name+"\n"+"Store_location:"+store_location;
        return storeDetails;

    }
}

