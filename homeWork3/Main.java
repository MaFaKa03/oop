package oop.homeWork3;//- Создать класс Студент
//        - Создать класс УчебнаяГруппаИтератор
//        - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//        - Реализовать его контракты (включая удаление)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Student> groupOne = new ArrayList<>();
        List<Student> groupTwo = new ArrayList<>();
        List<Student> groupThree = new ArrayList<>();
        List<List<Student>> ivanovsGroups = new ArrayList<>();
        List<List<Student>> petrovsGroups = new ArrayList<>();
        ivanovsGroups.add(groupOne);
        ivanovsGroups.add(groupThree);
        petrovsGroups.add(groupTwo);
        Teacher petrov = new Teacher("Anatoliy", "Petrov", petrovsGroups);
        Teacher ivanov = new Teacher("Alexander", "Ivanov", ivanovsGroups);
        teachers.add(petrov);
        teachers.add(ivanov);
        students.add(new Student("Alex", "Park", 1, 5, ivanov));
        students.add(new Student("Kostya", "Khait", 2, 4, ivanov));
        students.add(new Student("Victoria", "Kravc", 3, 3, petrov));


        StudentComparator comparator = new StudentComparator();
        Collections.sort(students, comparator);
        GroupItterator group = new GroupItterator(students);
        while (group.hasNext()){
            System.out.println(group.next());
        }




        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getGroupId() == 1){
               groupOne.add(students.get(i));
            } else if (students.get(i).getGroupId() == 2) {
                groupTwo.add(students.get(i));
            }else {
                groupThree.add(students.get(i));
            }
        }
//
//
//        if(Arrays.asList(groupOne).get(0).contains(ivanov) == true){
//            ivanovsGroups.add(groupOne);
//        } else if (Arrays.asList(groupTwo).get(0).contains(ivanov) == true) {
//            ivanovsGroups.add(groupTwo);
//        } else if(Arrays.asList(groupThree).get(0).contains(ivanov)){
//            ivanovsGroups.add(groupThree);
//        }
//
//        if(Arrays.asList(groupOne).get(0).contains(petrov) == true){
//            petrovsGroups.add(groupOne);
//        } else if (Arrays.asList(groupTwo).get(0).contains(petrov) == true) {
//            petrovsGroups.add(groupTwo);
//        } else if (Arrays.asList(groupThree).get(0).contains(petrov)){
//            petrovsGroups.add(groupThree);
//        }
        TeacherComparator teacherComparator = new TeacherComparator();
        Collections.sort(teachers, teacherComparator);


//        System.out.println(groupOne);
//        System.out.println(groupTwo);
//        System.out.println(groupThree);

        AllTeachers teachersIterator = new AllTeachers(teachers);
        while (teachersIterator.hasNext()){
            System.out.println(teachersIterator.next());
        }
    }
}