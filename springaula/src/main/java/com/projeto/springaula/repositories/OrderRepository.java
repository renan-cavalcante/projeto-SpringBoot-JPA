package com.projeto.springaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.springaula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
