package com.adp.theatreservice.controller;

import com.adp.theatreservice.model.Theatre;
import com.adp.theatreservice.service.ThaetreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/theatres")
public class TheatreController {

    @Autowired
    private ThaetreService thaetreService;

    @PostMapping
    public Theatre addTheatre(@RequestBody Theatre theatre){
        return thaetreService.addTheatre(theatre);
    }

    @GetMapping("/getTheatreById/{id}")
    public Theatre getTheatreById(@PathVariable("id") int id){
        return thaetreService.getTheatreById(id);
    }

    @GetMapping("/getTheatreByName/{name}")
    public Theatre getTheatreByName(@PathVariable("name") String name){
        return thaetreService.getTheatreByName(name);
    }
}
