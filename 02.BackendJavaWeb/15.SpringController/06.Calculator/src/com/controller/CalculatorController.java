package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CalculatorController {

    @PostMapping("/calculator")
    public String calculator(Model model, @RequestParam("cal") String cal,@RequestParam("firstNumber") double firstNumber, @RequestParam("secondNumber") double secondNumber){
        Map<String, Double> calMap = new HashMap<>();
        calMap.put("addition",firstNumber + secondNumber );
        calMap.put("subtraction",firstNumber - secondNumber);
        calMap.put("multiplication",firstNumber * secondNumber );
        calMap.put("division",firstNumber / secondNumber );
        model.addAttribute("result", calMap.get(cal));
        return "frameCalculator";
    }
    @GetMapping("")
    public String frame(Model model){
        return "frameCalculator";
    }
}
