package com.workshop.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
