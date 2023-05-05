package oop.homework5.model;

public class User {

    private String name;
    private double salary;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public User(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void enrolment(double enrSalary) {
        this.salary += enrSalary;

    }
    public void writeOf(double ofSalary) {
        this.salary -= ofSalary;

    }
}
