package com.uep.wap.controller;

import com.uep.wap.model.Player;
import com.uep.wap.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rankings")
public class RankingsController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public String showRankingsPage(Model model) {
        List<Player> rankings = playerService.getRankings();

        model.addAttribute("rankings", rankings);

        return "rankings";
    }
}
