package com.uep.wap.service;

import com.uep.wap.model.Tournament;
import com.uep.wap.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Tournament getTournamentById(int id) {
        Optional<Tournament> optionalTournament = tournamentRepository.findById(id);
        return optionalTournament.orElse(null);
    }

    public void addTournament(Tournament tournament) {
        tournamentRepository.save(tournament);
    }

    public void updateTournament(Tournament tournament) {
        tournamentRepository.save(tournament);
    }

    public void deleteTournament(int id) {
        tournamentRepository.deleteById(id);
    }
}
