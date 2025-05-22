package com.hooligan.springcourse.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {


      /// use HttpServletRequest if you need not only params, if no params in request variables will be null
//    @GetMapping("/hello")
//    public String helloPage(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//
//        System.out.println("Hello " + name + " " + surname);
//
//        return "first/hello";
//    }

    /// use if you need only params, if no params in request throw exception or use required = false
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name, @RequestParam("surname") String surname) {

        System.out.println("Hello " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}
