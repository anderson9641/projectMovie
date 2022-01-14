package com.eventds.dsmovie.repositories;

import com.eventds.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
    

