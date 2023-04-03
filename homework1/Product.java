package oop.homework1;

public abstract class Product {
    //public boolean getValue;
    private String name;
    private int cost;



    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", cost=" + cost + ", ";
    }

    Product(String name, int cost){
        this.name = name;
        this.cost = cost;

    }
}
