package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    //@Autowired
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public void addPlayer(PlayerDTO playerDTO){
        Player player = new Player();
        player.setFirstName(playerDTO.getFirstName());
        player.setLastName(playerDTO.getLastName());
        player.setGender(playerDTO.getGender());
        player.setEmail(playerDTO.getEmail());
        player.setBirthDate(playerDTO.getBirthDate());
        player.setPassword(playerDTO.getPassword());
        playerRepository.save(player);
        System.out.println("Player added!");
    }

    public List<Player> getRankings() {
       List<Player> rankings = playerRepository.findAllByOrderByPointsDesc();

        return rankings;
    }

    public Iterable<Player> getAllPlayers() {return playerRepository.findAll();}
}
