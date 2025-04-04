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
    public String events(Model model)
    {
        return "home/events";
    }

    @GetMapping("/nv_event1")
    public String nv_event1(Model model)
    {
        return "home/nv_event1";
    }
    @GetMapping("/nv_event2")
    public String nv_event2(Model model)
    {
        return "home/nv_event2";
    }
    @GetMapping("/nv_event3")
    public String nv_event3(Model model)
    {
        return "home/nv_event3";
    }

    @GetMapping("/tl_event")
    public String tl_event(Model model)
    {
        return "home/tl_event";
    }

    @GetMapping("/madspild-for")
    public String madspildfor(Model model) {
        return "home/madspild-for";
    }

    @GetMapping("/samarbejdspartnere")
    public String samarbejdspartnere() {
        return "home/samarbejdspartnere";
    }

    @GetMapping("/madspild-org")
    public String madspildorg() {
        return "home/madspild-org";
    }

    @GetMapping("/madspild-vir")
    public String madspildvir() {
        return "home/madspild-vir";
    }

    @GetMapping("/blivpartner")
    public String blivpartner() {return  "home/blivpartner";}

    @GetMapping("/tilmeld-nyhedsbrev")
    public String timeldnyhedsbrev() {
        return "home/tilmeld-nyhedsbrev";
    }

    @GetMapping("/tak-nyhedsbrev")
    public String taknyhedsbrev() {
        return "home/tak-nyhedsbrev";
    }
}