package com.controller;

import com.dao.UserDao;
import com.model.Login;
import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/login")
    public String home(@RequestParam("account") String account, @RequestParam("password") String password, Model model, Login login){
//
//        model.addAttribute("account", account);
//        model.addAttribute("password", password);

        login.setAccount(account);
        login.setPassword(password);
        User user = UserDao.checkLogin(login);

        if (user==null){
            return "error";
        } else {
            model.addAttribute("user", user);
            return "user";
        }


    }
}
