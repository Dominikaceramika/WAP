package com.uep.wap.service;

import com.uep.wap.dto.TournamentDirectorDTO;
import com.uep.wap.model.TournamentDirector;
import com.uep.wap.repository.TournamentDirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentDirectorService {

    @Autowired
    private TournamentDirectorRepository tournamentDirectorRepository;

    public void addTournamentDirectorRepository(TournamentDirectorDTO tournamentDirectorDTO) {
        TournamentDirector tournamentDirector = new TournamentDirector();
        tournamentDirector.setUsername(tournamentDirectorDTO.getUsername());
        tournamentDirector.setStatus(tournamentDirectorDTO.getStatus());
        tournamentDirector.setEmail(tournamentDirectorDTO.getEmail());
        tournamentDirector.setPhone(tournamentDirectorDTO.getPhone());
        tournamentDirectorRepository.save(tournamentDirector);
        System.out.println("Tournament dicrector added!");
    }

    public Iterable<TournamentDirector> getAllTournamentDirectors() {return tournamentDirectorRepository.findAll();}

}
