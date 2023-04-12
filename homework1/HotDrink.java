package oop.homework1;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int cost, int temperature, double value ){
        super(name, cost, value);
        this.temperature = temperature;

    }
    public int getTemperature(){
        return temperature;
    }


    @Override
    public String toString() {
        return "HotDrink{" + super.toString() +
                "temperature=" + temperature +
                '}';
    }
}

