package oop.homework1.Model;

import oop.homework1.Model.Product;

public class ColdDrink  extends Product {

    private boolean sparkling;
    public ColdDrink(String name, int cost, double value, boolean sparkling) {
        super(name, cost, value);
        this.sparkling = sparkling;
    }

    @Override
    public String toString() {
        return "ColdDrink{" + super.toString() +
                "sparkling=" + sparkling +
                '}';
    }
}
