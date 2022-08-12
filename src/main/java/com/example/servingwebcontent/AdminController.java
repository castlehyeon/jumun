package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin(@RequestParam(name="name", required=false, defaultValue="무명관리자") String name, Model model) {
        model.addAttribute("name", name);
        return "admin";
    }

}
