package com.hooligan.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "lastname", required = false) String lastname,
                            Model model) {

        model.addAttribute("message", "Hello " + name + " " + lastname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a") double a,
                                 @RequestParam(value = "b") double b,
                                 @RequestParam(value = "action")  String action,
                                 Model model){

        switch (action){
            case "addition":
                model.addAttribute("result", a + b);
                break;
            case "subtraction":
                model.addAttribute("result", a - b);
                break;
            case "multiplication":
                model.addAttribute("result", a * b);
                break;
            case "division":
                model.addAttribute("result", a / b);
                break;
        }


        return "first/calculator";
    }
}
