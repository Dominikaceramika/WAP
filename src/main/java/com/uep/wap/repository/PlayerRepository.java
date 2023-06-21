package com.uep.wap.repository;

import com.uep.wap.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    List<Player> findAllByOrderByPointsDesc();
}
