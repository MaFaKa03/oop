package oop.homeWork3;

import java.util.Iterator;
import java.util.List;

public class AllTeachers implements Iterator <Teacher> {
    private int counter;
    private List<Teacher> teachers;

    public AllTeachers(List<Teacher> teachers){
        this.counter = 0;
        this.teachers = teachers;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }

    public Teacher next(){
        if(!hasNext()){
            return null;
        }
        return teachers.get(counter++);
    }

}
