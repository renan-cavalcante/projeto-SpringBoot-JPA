package com.projeto.springaula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.springaula.entities.Category;
import com.projeto.springaula.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> finadAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> category = repository.findById(id);
		return category.get();
	}
}
