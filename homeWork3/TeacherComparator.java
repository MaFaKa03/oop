package oop.homeWork3;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if(o1.getAllGroups().size() > o2.getAllGroups().size()){
            return -1;
        } else if (o1.getAllGroups().size() == o2.getAllGroups().size()) {
            return  0;
        }
        return 1;

    }
}
