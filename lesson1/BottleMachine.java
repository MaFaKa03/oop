package oop.lesson1;

import java.util.ArrayList;
import java.util.List;

public class BottleMachine implements VendingMachine{
    @Override
    public void addProduct(String name, int cost) {
        BottleWater product = new BottleWater(name, cost);
        products.add(product);
    }
}