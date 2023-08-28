package com.projeto.springaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.springaula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
