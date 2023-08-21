package com.projeto.springaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.springaula.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
