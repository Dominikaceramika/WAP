package com.uep.wap.repository;

import com.uep.wap.model.Match;
import com.uep.wap.model.TennisCourt;
import com.uep.wap.model.TournamentDirector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentDirectorRepository extends CrudRepository<TournamentDirector, Integer> {
}
