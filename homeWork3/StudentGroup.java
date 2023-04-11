package oop.homeWork3;

import java.util.List;
import java.util.Objects;

public class StudentGroup {

    private Teacher teacher;

    private Student student;

    private List<Objects> students;

    private List<StudentGroup> studentGroups;

    public void  addStudent(Student student){
        this.student = student;
    }

    int groupNumber;
    public  void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }



}
