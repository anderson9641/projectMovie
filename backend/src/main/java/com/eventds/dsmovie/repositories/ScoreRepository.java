package com.eventds.dsmovie.repositories;

import com.eventds.dsmovie.entities.Score;
import com.eventds.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
    

