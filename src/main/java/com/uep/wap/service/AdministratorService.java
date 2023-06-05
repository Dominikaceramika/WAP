package com.uep.wap.service;

import com.uep.wap.dto.AdministratorDTO;
import com.uep.wap.model.Administrator;
import com.uep.wap.repository.AdministratiorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {

    @Autowired
    private AdministratiorRepository administratiorRepository;

    public void addAdministrator(AdministratorDTO administratorDTO){
        Administrator administrator = new Administrator();
        administrator.setUsername(administratorDTO.getUsername());
        administrator.setStatus(administratorDTO.getStatus());
        administrator.setEmail(administratorDTO.getEmail());
        administrator.setPhone(administratorDTO.getPhone());
        administratiorRepository.save(administrator);
        System.out.println("Administrator added!");
    }

    public Iterable<Administrator> getAllAdministrators() {return administratiorRepository.findAll();}
}
