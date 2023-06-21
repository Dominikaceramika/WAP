package com.uep.wap.service;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.model.FilterForm;
import com.uep.wap.model.Match;
import com.uep.wap.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public void addMatch(MatchDTO matchDTO) {
        Match match = new Match();
        match.setCategory(matchDTO.getCategory());
        match.setScore(matchDTO.getScore());
        match.setMatchDate(matchDTO.getMatchDate());
        match.setCourt(matchDTO.getCourt());
        match.setPlayerList(matchDTO.getPlayerList());
        match.setReferee(matchDTO.getReferee());
        matchRepository.save(match);
        System.out.println("Match added!");
    }

    public Iterable<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public List<Match> getOngoingMatches() {
        return matchRepository.findByStatus("ongoing");
    }

    public List<Match> getCompletedMatches() {

        return matchRepository.findByStatus("completed");
    }

    public List<Match> filterMatches(FilterForm filterForm) {
        String category = filterForm.getCategory();
        Date startDate = filterForm.getStartDate();
        Date endDate = filterForm.getEndDate();

        List<Match> filteredMatches = matchRepository.findByCategoryAndMatchDateBetween(category, startDate, endDate);

        return filteredMatches;
    }

}