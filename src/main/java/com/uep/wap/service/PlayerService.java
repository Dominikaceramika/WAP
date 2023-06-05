package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void addPlayer(PlayerDTO playerDTO){
        Player player = new Player();
        player.setFirstName(playerDTO.getFirstName());
        player.setLastName(playerDTO.getLastName());
        player.setGender(playerDTO.getGender());
        player.setEmail(playerDTO.getEmail());
        player.setBirthDate(playerDTO.getBirthDate());
        playerRepository.save(player);
        System.out.println("Player added!");
    }

    public Iterable<Player> getAllPlayers() {return playerRepository.findAll();}
}
