package com.eventds.dsmovie.controllers;

import com.eventds.dsmovie.dto.MovieDTO;
import com.eventds.dsmovie.dto.ScoreDTO;
import com.eventds.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/score")
public class ScoreController {
    
    @Autowired
    ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }



}
