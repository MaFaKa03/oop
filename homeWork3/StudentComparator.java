package oop.homeWork3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getName().length() > o2.getName().length()){
            return -1;
        } else if (o2.getName().length() == o2.getName().length()) {
            return 0;
        }
        return 1;
    }
}
