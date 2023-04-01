package oop.lesson1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    List<Product> products = new ArrayList<>();

    public static Product getProductByname(String name){
        for (Product product : products) {
            if (product.getName()==name) {
                return product;
            }
        }
        return null;


    }
    public static Product getProductByPrice(int cost){
        for (Product product : products) {
            if (product.getCost()==cost) {
                return product;
            }
        }
        return null;

    }

    public static void addProduct(String name, int cost) {
        Product product = new Product(name, cost);
        products.add(product);
    }


}   



