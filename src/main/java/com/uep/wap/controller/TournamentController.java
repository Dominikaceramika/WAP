package com.uep.wap.controller;

import com.uep.wap.model.Tournament;
import com.uep.wap.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping
    public String showTournamentPage(Model model) {
        List<Tournament> tournaments = tournamentService.getAllTournaments();
        model.addAttribute("tournaments", tournaments);
        return "tournament";
    }
}
