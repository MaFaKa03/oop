package oop.homework1;

public class Program {
    public static void main(String[] args) {
        HotDrinkMachine m = new HotDrinkMachine();
        m.addProduct(new HotDrink("Black tea", 110, 80, 0.3));
        m.addProduct(new HotDrink("Green tea", 110, 80, 0.3));
        m.addProduct(new HotDrink("Cappuccino", 300, 65, 0.5));
        m.addProduct(new HotDrink("Americano", 150, 75, 0.7));
        m.addProduct(new HotDrink("Espresso", 150, 80, 0.15));
        m.addProduct(new HotDrink("Latte", 350, 75, 0.5));
        for (Product product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(m.getProduct("Black tea", 80, 0.3));
        System.out.println(m.getProduct("Green tea", 50, 0.2));

    }
}
