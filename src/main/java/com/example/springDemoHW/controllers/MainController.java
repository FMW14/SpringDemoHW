package com.example.springDemoHW.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.ZonedDateTime;

@Controller
public class MainController {
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("time", ZonedDateTime.now());
        return "main";
    }
}
