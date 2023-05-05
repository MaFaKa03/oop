package oop.homework1.Service;

import oop.homework1.Model.Product;
import oop.homework1.Repositoriy.DrinkMachine;

import java.util.List;

public class DrinkMachineServiceImpl <T extends Product> implements DrinkMachineService {

    private DrinkMachine drinkMachine = new DrinkMachine();
    @Override
    public void addProduct(Product product) {
        if (product != null){
            drinkMachine.addProduct(product);
        }else {
            System.out.println("Product is null");
        }
    }

    @Override
    public T getProduct(String name, double value) {

        return (T) drinkMachine.getProduct(name, value);
    }

    @Override
    public List getProducts() {
        return drinkMachine.getProducts();
    }
}
