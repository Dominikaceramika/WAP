package com.uep.wap.controller;

import com.uep.wap.dto.TournamentDirectorDTO;
import com.uep.wap.model.TournamentDirector;
import com.uep.wap.service.TournamentDirectorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TournamentDirectorController {

    private final TournamentDirectorService tournamentDirectorService;

    public TournamentDirectorController(TournamentDirectorService tournamentDirectorService){this.tournamentDirectorService = tournamentDirectorService;}

    @GetMapping(path = "/tournamentDirectors")
    public Iterable<TournamentDirector> getAllTournamentDirectors(){ return tournamentDirectorService.getAllTournamentDirectors();}

    @PostMapping(path = "/tournamentDirectors")
    public String addTournamentDirector(@RequestBody TournamentDirectorDTO tournamentDirectorDTO){
        tournamentDirectorService.addTournamentDirectorRepository(tournamentDirectorDTO);
        return "Tournament director added!";
    }
}
