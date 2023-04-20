package oop.homework1.Service;

import oop.homework1.Model.Product;

import java.util.List;

public interface DrinkMachineService <T extends Product> {

    void addProduct(T t);
    T getProduct(String name, double value);

    List<T> getProducts();
}
