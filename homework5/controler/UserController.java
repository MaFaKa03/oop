package oop.homework5.controler;

import oop.homework5.model.User;
import oop.homework5.service.UserService;
import oop.homework5.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, double salary){

        userService.safeUser(new User(name, salary));
    }
    public void removeUser(User user){
        userService.removeUser(user);
    }
    public void updateUser(int index, User user){
        userService.updateUser(index, user);
    }

    public List<User> getUserList(){
        return userService.getUserList();
    }

    public void enrolment(int index,  double enrSalary){
        userService.enrolment(index, enrSalary);
    }

    public void writeOf(int index, double ofSalary){
        userService.writeOf(index, ofSalary);
    }

}
