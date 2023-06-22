package com.uep.wap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String showAboutPage(Model model) {
        // You can add any necessary logic here to fetch dynamic data for the About page
        // For simplicity, let's assume the content is static

        String title = "About Us";
        String description = "Welcome to our website! We are a team of dedicated professionals...";

        model.addAttribute("title", title);
        model.addAttribute("description", description);

        return "about";
    }
}
