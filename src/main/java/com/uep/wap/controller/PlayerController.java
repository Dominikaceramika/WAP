package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.service.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {this.playerService = playerService;}

    @GetMapping(path = "/players")
    public Iterable<Player> getAllStudents() {return playerService.getAllPlayers();}

    @PostMapping(path = "/players")
    public String addPlayers (@RequestBody PlayerDTO playerDTO){
        playerService.addPlayer((playerDTO));
        return "Player added!";
    }
}
