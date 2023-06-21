package com.uep.wap.controller;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.model.FilterForm;
import com.uep.wap.model.Match;
import com.uep.wap.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/add")
    public String addMatch(MatchDTO matchDTO) {
        matchService.addMatch(matchDTO);
        return "redirect:/score";
    }

    @GetMapping
    public String showScorePage(Model model) {
        List<Match> ongoingMatches = matchService.getOngoingMatches();
        List<Match> completedMatches = matchService.getCompletedMatches();

        model.addAttribute("ongoingMatches", ongoingMatches);
        model.addAttribute("completedMatches", completedMatches);

        return "score";
    }

    @PostMapping("/filter")
    public String filterMatches(FilterForm filterForm, Model model) {
        String category = filterForm.getCategory();
        Date startDate = filterForm.getStartDate();
        Date endDate = filterForm.getEndDate();

        List<Match> filteredMatches = matchService.filterMatches(filterForm);

        model.addAttribute("filteredMatches", filteredMatches);

        return "score";
    }
}
