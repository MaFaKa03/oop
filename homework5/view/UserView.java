package oop.homework5.view;

import oop.homework5.controler.UserController;
import oop.homework5.model.User;


//Реализовать систему работы банковского приложения.
//        - Создать класс пользователь и соответсвующие классы
//        - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
//        - Реализовать функции добавления и удаления пользователя


//
//Добавить операции удаления, изменения и вывода пользователей

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name, salary: ");
        userController.saveUser("Anatoliy", 25000);
        userController.saveUser("Kostya", 17000);
        int i = 0;
        for (User user: userController.getUserList()) {
            System.out.printf("index %s is %d \n" , user,i);
            i++;
        }
//        System.out.println("Enter index for +: ");
//        i = scanner.nextInt();
//        System.out.println("Enter sum: ");
//        double sum = scanner.nextDouble();
//        userController.writeOf(i, sum);

//        scanner.close();
        userController.writeOf(0, 1000);

        int j = 0;
        for (User user: userController.getUserList()) {
            System.out.printf("index %s is %d \n" , user,j);
            j++;
        }

    }
}
