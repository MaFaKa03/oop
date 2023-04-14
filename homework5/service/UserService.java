package oop.homework5.service;

import oop.homework5.model.User;

import java.util.List;

public interface UserService {
    void safeUser(User user);
    void removeUser(User user);

    void updateUser(int index, User user);

    List<User> getUserList();

    void enrolment(int index, double ofSalary);

    void writeOf(int index, double enrSalary);

}
