package com.uep.wap.service;

import com.uep.wap.dto.RefereeDTO;
import com.uep.wap.model.Referee;
import com.uep.wap.repository.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefereeService {

    @Autowired
    private RefereeRepository refereeRepository;

    public void addReferee(RefereeDTO refereeDTO){
        Referee referee = new Referee();
        referee.setFirstName(refereeDTO.getFirstName());
        referee.setLastName(refereeDTO.getLastName());
        referee.setStatus(refereeDTO.getStatus());
        referee.setEmail(refereeDTO.getEmail());
        refereeRepository.save(referee);
        System.out.println("Referee saved!");

    }

    public Iterable<Referee> getAllReferees() {return refereeRepository.findAll();}

}
