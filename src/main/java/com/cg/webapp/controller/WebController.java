package com.cg.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping("/")
    public String showpage(){
        return "home";
    }

    @PostMapping("/page2")
    public String showpage2(@RequestParam String firstname, @RequestParam String lastname, Model model){
        model.addAttribute("firstname",firstname);
        model.addAttribute("lastname",lastname);
        return "page2";
    }

    @PostMapping("/page3")
    public String showPage3(@RequestParam String firstname, @RequestParam String lastname,@RequestParam String email, @RequestParam String phone, Model model){
        model.addAttribute("firstname",firstname);
        model.addAttribute("lastname",lastname);
        model.addAttribute("email",email);
        model.addAttribute("phone",phone);
        return "page3";
    }

    @PostMapping("/page4")
    public String showPage4(@RequestParam String firstname, @RequestParam String lastname,@RequestParam String email, @RequestParam String phone,@RequestParam String city, @RequestParam String country, Model model){
        model.addAttribute("firstname",firstname);
        model.addAttribute("lastname",lastname);
        model.addAttribute("email",email);
        model.addAttribute("phone",phone);
        model.addAttribute("city",city);
        model.addAttribute("country",country);
        return "page4";
    }
}
