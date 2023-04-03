package oop.homework1;

import java.util.ArrayList;

public interface  Machine {
    //List <Product> products = new ArrayList<>();
    Product getProductByName(String name);

    Product getProductByCost(int cost);

    public HotDrink getProduct(String name);



    void addProduct(Product product);
}
