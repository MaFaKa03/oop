package oop.lesson1;
// //  Сделать класс Товар абстрактным,
// создать нескольких наследников 
// (к примеру: БутылкаВоды), 
// сделать интерфейсом ТорговыйАвтомат 
// и реализовать класс какого-то одного типа 
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат   

public class BottleWater extends Product{
    BottleWater(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.type = "Bottle";
    }    
}

