package oop.homework1.Controller;

import oop.homework1.Model.Product;
import oop.homework1.Repositoriy.DrinkMachine;
import oop.homework1.Service.DrinkMachineService;
import oop.homework1.Service.DrinkMachineServiceImpl;

import java.util.List;

public class DrinkController  {
    private DrinkMachineService drinkMachineService = new DrinkMachineServiceImpl();

    public void addProduct(Product product){
        drinkMachineService.addProduct(product);
    }

    Object getProduct(String name, double value){
        return drinkMachineService.getProduct(name, value);
    }

    List<Object> getProducts(){
        return drinkMachineService.getProducts();
    }

}
