package com.eventds.dsmovie.services;

import com.eventds.dsmovie.dto.MovieDTO;
import com.eventds.dsmovie.dto.ScoreDTO;
import com.eventds.dsmovie.entities.Movie;
import com.eventds.dsmovie.entities.Score;
import com.eventds.dsmovie.entities.User;
import com.eventds.dsmovie.repositories.MovieRepository;
import com.eventds.dsmovie.repositories.ScoreRepository;
import com.eventds.dsmovie.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {
    
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){

        User user = userRepository.findByEmail(dto.getEmail());
        
        if(user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getValue());

        scoreRepository.saveAndFlush(score);

        Double sum = 0.0;

        for(Score s : movie.getScores()){
            sum += s.getValue();
        }

        Double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }
}
