package oop.homework1;

public class HotDrink extends Product {
    private int temperature;
    private double value;
    public HotDrink(String name, int cost, int temperature, double value ){
        super(name, cost);
        this.temperature = temperature;
        this.value = value;
    }
    public int getTemperature(){
        return temperature;
    }
    public double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "HotDrink{" + super.toString() +
                "temperature=" + temperature +
                ", value=" + value +
                '}';
    }
}

