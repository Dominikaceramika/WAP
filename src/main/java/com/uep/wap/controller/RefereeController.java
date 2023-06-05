package com.uep.wap.controller;

import com.uep.wap.dto.RefereeDTO;
import com.uep.wap.model.Referee;
import com.uep.wap.service.RefereeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class RefereeController {

    private final RefereeService refereeService;

    public RefereeController(RefereeService refereeService) {this.refereeService = refereeService;}

    @GetMapping(path = "/referees")
    public Iterable<Referee> getAllReferees() { return refereeService.getAllReferees();}

    @PostMapping(path = "/referees")
    public String addReferee(@RequestBody RefereeDTO refereeDTO){
        refereeService.addReferee((refereeDTO));
        return "Referee added!";
    }
}
