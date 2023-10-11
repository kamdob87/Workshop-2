package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Kamil");
        user.setEmail("kamdob87@gmail.com");
        user.setPassword("alamakota");

        UserDao userDao = new UserDao();
//        * testowanie create
//        userDao.create(user);

//        * testowanie read
//        System.out.println(userDao.read(3).getUserName());
    }
}