package com.uep.wap.service;

import com.uep.wap.dto.TennisCourtDTO;
import com.uep.wap.model.TennisCourt;
import com.uep.wap.repository.TennisCourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TennisCourtService {

    @Autowired
    private TennisCourtRepository tennisCourtRepository;

    public void addTennisCourt(TennisCourtDTO tennisCourtDTO){
        TennisCourt tennisCourt = new TennisCourt();
        tennisCourt.setPlayerId(tennisCourtDTO.getPlayerId());
        tennisCourt.setLocation(tennisCourtDTO.getLocation());
        tennisCourtRepository.save(tennisCourt);
        System.out.println("Tennis court added!");

    }

    public Iterable<TennisCourt> getAllTennisCourts() {return tennisCourtRepository.findAll();}
}
