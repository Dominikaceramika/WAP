package com.uep.wap.repository;

import com.uep.wap.model.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MatchRepository extends CrudRepository<Match, Integer> {

    List<Match> findByStatus(String status);
    List<Match> findByCategoryAndMatchDateBetween(String category, Date startDate, Date endDate);
}
