package oop.homeWork3;

import java.util.List;

public class Teacher {
    private String name;
    private String sureName;

    private List<List<Student>> allGroups;


    Teacher(String name, String sureName, List<List<Student>> allGroups){
        this.name = name;
        this.sureName = sureName;
        this.allGroups = allGroups;


    }

    public void addGroup(List<Student> group){
        allGroups.add(group);
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", groups: " + allGroups +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public List<List<Student>> getAllGroups() {
        return allGroups;
    }
}
