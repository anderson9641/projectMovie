package com.eventds.dsmovie.services;

import java.util.List;

import com.eventds.dsmovie.dto.MovieDTO;
import com.eventds.dsmovie.entities.Movie;
import com.eventds.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> resultDTO = result.map(x -> new MovieDTO(x));
        return resultDTO;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result = movieRepository.findById(id).get();
        MovieDTO resultDTO = new MovieDTO(result);
        return resultDTO;
    }
}
