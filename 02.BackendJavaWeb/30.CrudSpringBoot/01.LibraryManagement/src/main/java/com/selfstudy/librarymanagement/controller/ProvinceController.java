package com.selfstudy.librarymanagement.controller;

import com.selfstudy.librarymanagement.entity.Province;
import com.selfstudy.librarymanagement.entity.Student;
import com.selfstudy.librarymanagement.service.ProvinceService;
import com.selfstudy.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @Autowired
    StudentService studentService;

    @GetMapping("/provinces")
    public ModelAndView listProvinces(){
        Iterable<Province> provinces = provinceService.findAllProvinces();
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces", provinces);
        return modelAndView;
    }

    @GetMapping("/create-province")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/province/create");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }

    @PostMapping("/create-province")
    public ModelAndView saveProvince(@ModelAttribute("province") Province province){
        provinceService.saveProvince(province);

        ModelAndView modelAndView = new ModelAndView("/province/create");
        modelAndView.addObject("province", new Province());
        modelAndView.addObject("message", "New province created successfully");
        return modelAndView;
    }

//    @GetMapping("/edit-province/{id}")
//    public ModelAndView showEditForm(@PathVariable int id){
//        Optional<Province> province = provinceService.findByIdProvince(id);
//        if(province != null) {
//            ModelAndView modelAndView = new ModelAndView("/province/edit");
//            modelAndView.addObject("province", province);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }

    @PostMapping("/edit-province")
    public ModelAndView updateProvince(@ModelAttribute("province") Province province){
        provinceService.saveProvince(province);
        ModelAndView modelAndView = new ModelAndView("/province/edit");
        modelAndView.addObject("province", province);
        modelAndView.addObject("message", "Province updated successfully");
        return modelAndView;
    }

//    @GetMapping("/delete-province/{id}")
//    public ModelAndView showDeleteForm(@PathVariable int id){
//        Optional<Province> province = provinceService.findByIdProvince(id);
//        if(province != null) {
//            ModelAndView modelAndView = new ModelAndView("/province/delete");
//            modelAndView.addObject("province", province);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }

    @PostMapping("/delete-province")
    public String deleteProvince(@ModelAttribute("province") Province province){
        provinceService.removeProvince(province.getId());
        return "redirect:provinces";
    }


}
