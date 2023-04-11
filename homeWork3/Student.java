package oop.homeWork3;

public class Student {
    private String name;
    private  String surName;
    private Integer groupId;

    private Integer score;

    private Teacher teacher;

    Student(String name, String surName, Integer groupId, Integer score, Teacher teacher){
        this.name = name;
        this.surName = surName;
        this.groupId = groupId;
        this.score = score;
        this.teacher = teacher;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", groupId=" + groupId + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public Integer getScore(){
        return score;
    }
}

