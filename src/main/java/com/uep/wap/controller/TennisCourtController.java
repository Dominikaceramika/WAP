package com.uep.wap.controller;

import com.uep.wap.dto.TennisCourtDTO;
import com.uep.wap.model.TennisCourt;
import com.uep.wap.service.TennisCourtService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TennisCourtController {

    private final TennisCourtService tennisCourtService;

    public TennisCourtController(TennisCourtService tennisCourtService){this.tennisCourtService = tennisCourtService;}

    public Iterable<TennisCourt> getAllTennisCourts(){ return tennisCourtService.getAllTennisCourts();}

    public String addTennisCourts(@RequestBody TennisCourtDTO tennisCourtDTO){
        tennisCourtService.addTennisCourt(tennisCourtDTO);
        return "Tennis Court added!";
    }
}
