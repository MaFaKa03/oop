// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы getProductsByname и getProductsByPrice

package oop.lesson1;

public abstract class Product {
    protected String name;
    protected int cost;
    
    protected String type;

    // public String type(){
    //     String type;
    // }
    
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name %s, cost %d", name, cost);
    }

    Product(String name, int cost, String type) {
        this.name = name;
        this.cost = cost;
        this.type = type;

    }

}
