package oop.homework1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements Machine{
    private List<HotDrink> products = new ArrayList<>();

    public List<HotDrink> getProducts(){
        return products;
    }
    public Product getProductByName(String name){
        for (Product product: products
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

    public Product getProductByCost(int cost){
        for (Product product: products
             ) {
            if(product.getCost() == cost){
                return product;
            }
        }
        return null;
    }
    public HotDrink getProduct(String name, int temperature, double value){
        for (HotDrink product: products
             ) {
            if(product.getName().equals(name) && product.getValue() == value && product.getTemperature() == temperature){
                return (HotDrink) product;
            }
        }
        return null;
    }
    public void addProduct(Product product){
        if(product instanceof HotDrink){
            products.add((HotDrink) product);
        }
    }
}
