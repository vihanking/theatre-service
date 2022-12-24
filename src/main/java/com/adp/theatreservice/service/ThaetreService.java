package com.adp.theatreservice.service;

import com.adp.theatreservice.exceptions.TheatreNotFoundException;
import com.adp.theatreservice.model.Theatre;
import com.adp.theatreservice.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ThaetreService {

    @Autowired
    private TheatreRepository theatreRepository;

    public Theatre addTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public Theatre getTheatreById(int id) {
        Optional<Theatre> optionalTheatre=theatreRepository.findById(id);
        return optionalTheatre.get();
    }

    public Theatre getTheatreByName(String name) {
        return theatreRepository.findByName(name);
    }
}
