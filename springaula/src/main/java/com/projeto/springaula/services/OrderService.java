package com.projeto.springaula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.springaula.entities.Order;
import com.projeto.springaula.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> finadAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = repository.findById(id);
		return user.get();
	}
}
