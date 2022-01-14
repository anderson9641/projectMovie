package com.eventds.dsmovie.repositories;

import com.eventds.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
    

