package oop.lesson11;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("barsik");
        cat.setAge(5);
        cat.setInGoodMood(true);

        Dog dog = new Dog();
        dog.setName("borik");
        dog.setAge(4);
        dog.setBreed("haski");
        cat.tellAboutYOurself();
        dog.tellAboutYOurself();
    }
    
}
