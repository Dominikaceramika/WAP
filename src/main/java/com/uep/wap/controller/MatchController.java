package com.uep.wap.controller;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.model.Match;
import com.uep.wap.service.MatchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService){this.matchService = matchService;}

    @GetMapping(path = "/matches")
    public Iterable<Match> getAllMatches() {return matchService.getAllMatches();}

    @PostMapping(path = "/matchess")
    public String addMatches(@RequestBody MatchDTO matchDTO){
        matchService.addMatch(matchDTO);
        return "Match added!";
    }
}
