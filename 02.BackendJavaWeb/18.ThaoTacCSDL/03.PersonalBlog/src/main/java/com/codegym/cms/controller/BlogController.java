package com.codegym.cms.controller;

import com.codegym.cms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/display")
    public String displayPage(Model model){
        model.addAttribute("blogs",blogService.findAll());
        return "display";
    }

}
