package oop.lesson1;

public class task1{
    public static void main(String[] args) {
        VendingMachine m = new VendingMachine();

        BottleMachine bottleMachine = new BottleMachine();
        m.addProduct("Coca-cola", 100);
        m.addProduct("Snikers", 50);
        System.out.println(m.getProductByPrice(50).toString());
        System.out.println(m.getProductByname("Coca-cola").toString());
        
    }
}