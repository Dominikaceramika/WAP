package com.uep.wap.controller;

import com.uep.wap.model.Player;
import com.uep.wap.model.RegistrationForm;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("registrationForm", new RegistrationForm());
        return "registration";
    }

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping
    public String processRegistrationForm(@ModelAttribute("registrationForm") RegistrationForm registrationForm) {
        Player player = new Player();
        player.setFirstName(registrationForm.getFirstName());
        player.setLastName(registrationForm.getLastName());
        player.setGender(registrationForm.getGender());
        player.setEmail(registrationForm.getEmail());
        player.setBirthDate(registrationForm.getBirthDate());
        playerRepository.save(player);
        return "registrationConfirmation";
    }

}
