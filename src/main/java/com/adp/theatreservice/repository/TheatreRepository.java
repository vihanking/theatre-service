package com.adp.theatreservice.repository;

import com.adp.theatreservice.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Integer> {
    Theatre findByName(String name);
}
