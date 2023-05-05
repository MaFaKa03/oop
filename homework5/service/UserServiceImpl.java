package oop.homework5.service;

import oop.homework5.model.User;
import oop.homework5.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();
    @Override
    public void safeUser(User user) {
        if (user != null){
            userRepository.saveUser(user);
        }else {
            System.out.println("User is null");
        }
    }

    public void removeUser(User user){
        if(user != null){
            userRepository.removeUser(user);
        }else {
            System.out.println("User is null");
        }
    }

    @Override
    public void updateUser(int index, User user) {
        if(user != null){
            userRepository.updateUser(index, user);
        }else {
            System.out.println("User is null");
        }
    }

    @Override
    public List<User> getUserList() {
        return userRepository.getUserList();
    }

    @Override
    public void enrolment(int index, double enrSalary) {
           userRepository.enrolment(index, enrSalary);
    }

    @Override
    public void writeOf(int index, double ofSalary) {

            userRepository.writeOf(index, ofSalary);

    }
}
