package com.dao;

import com.model.Login;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static List<User> users;

    static{

        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(21);
        u1.setName("Trinh");
        u1.setAccount("maitrinh");
        u1.setPassword("12345");
        u1.setEmail("maitrinh@gmail.com");
        users.add(u1);

        User u2 = new User();
        u2.setAge(22);
        u2.setName("Ni");
        u2.setAccount("tranni");
        u2.setPassword("54321");
        u2.setEmail("tranni@gmail.com");
        users.add(u2);

        User u3 = new User();
        u3.setAge(23);
        u3.setName("Tin");
        u3.setAccount("tintin");
        u3.setPassword("123");
        u3.setEmail("tintin@gmail.com");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u: users){
            if (u.getAccount().equals(login.getAccount())&&u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
