package oop.homework5.repository;

import oop.homework5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public void saveUser(User user){
//        try (FileWriter fileWriter = new FileWriter("users.txt", true)){
//            fileWriter.write(user.toString());
//            fileWriter.write("\n");
//        } catch (Exception e){
//            System.out.println("eror in repo");
//        }

        userList.add(user);
    }

    public void removeUser(User user){
        userList.remove(user);
    }
    public void updateUser(int index, User user){
        userList.set(index, user);
    }

    public List<User> getUserList(){
        return userList;
        }

    public void enrolment(int index, double enrSalary) {
        userList.get(index).enrolment(enrSalary);

    }
    public void writeOf(int index, double ofSalary) {
        userList.get(index).writeOf(ofSalary);

    }
}




//    public void removeUser(User user){
//    try(FileReader fileReader = new FileReader("users.txt")) {
//        fileReader.transferTo(new FileWriter("users.txt"));
//    }
//    }

