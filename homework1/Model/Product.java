package oop.homework1.Model;

public abstract class Product {

    private String name;
    private int cost;

    private double value;

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

    Product(String name, int cost, double value){
        this.name = name;
        this.cost = cost;
        this.value = value;

    }
    public double getValue(){
        return value;
    }
}
