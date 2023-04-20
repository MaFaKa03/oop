package oop.homework1.View;

import oop.homework1.Model.ColdDrink;
import oop.homework1.Repositoriy.DrinkMachine;
import oop.homework1.Model.HotDrink;

public class Program {
    public static void main(String[] args) {
        DrinkMachine Drink = new DrinkMachine();
        //DrinkMachine coldDrink = new DrinkMachine();
        Drink.addProduct(new HotDrink("Black tea", 111, 80, 0.3));
        Drink.addProduct(new HotDrink("Green tea", 110, 80, 0.3));
        Drink.addProduct(new HotDrink("Cappuccino", 300, 65, 0.5));
        Drink.addProduct(new HotDrink("Americano", 150, 75, 0.7));
        Drink.addProduct(new HotDrink("Espresso", 150, 80, 0.15));
        Drink.addProduct(new HotDrink("Latte", 350, 75, 0.5));
        Drink.addProduct(new ColdDrink("Cola", 100, 0.33, true));

        for (Object product : Drink.getProducts()) {
            System.out.println(product);
        }
        System.out.println();



        System.out.println(Drink.getProduct("Black tea", 0.3));
        System.out.println(Drink.getProduct("Green tea", 0.2));
        System.out.println(Drink.getProduct("Cola",0.33));

    }
}
