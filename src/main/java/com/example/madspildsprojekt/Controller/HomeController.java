package com.example.madspildsprojekt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        return "home/index";
    }
    @GetMapping("/events")
    public String event(Model model)
    {
        return "home/events";
    }

    @GetMapping("/madspild-for")
    public String madspildfor(Model model) {
        return "home/madspild-for";
    }
}
