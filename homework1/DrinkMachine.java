package oop.homework1;

import java.util.ArrayList;
import java.util.List;

public class DrinkMachine<T extends Product> implements Machine {
    private List<T> products = new ArrayList<>();

    public List<T> getProducts(){
        return products;
    }
    public T getProductByName(String name){
        for (T product: products
             ) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

//    @Override
//    public Product getProductByCost(int cost) {
//        return null;
//    }

    public T getProductByCost(int cost){
        for (T product: products
             ) {
            if(product.getCost() == cost){
                return product;
            }
        }
        return null;
    }


    public T getProduct(String name, double value){
        for (T product: products
             ) {
            if(product.getName().equals(name) && product.getValue() == value){
                return (T) product;
            }
        }
        return null;
    }
    public void addProduct(Product product){
        if(product instanceof Product){
            products.add((T) product);
        }
    }
}
