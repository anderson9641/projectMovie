package com.eventds.dsmovie.dto;

public class ScoreDTO {
 
    private Long movieId;
    private String email;
    private Double value;

    public ScoreDTO() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    
}
