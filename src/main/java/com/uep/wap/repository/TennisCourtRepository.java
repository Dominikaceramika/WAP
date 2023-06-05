package com.uep.wap.repository;

import com.uep.wap.model.Match;
import com.uep.wap.model.TennisCourt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TennisCourtRepository extends CrudRepository<TennisCourt, Integer> {
}
