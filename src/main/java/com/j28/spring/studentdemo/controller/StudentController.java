package com.j28.spring.studentdemo.controller;

import com.j28.spring.studentdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @GetMapping("/")
    public String getIndexPage(Model model, @RequestParam(name = "myName") String name) {
        model.addAttribute("nameToPass" , name);
        return "index";
    }
}
