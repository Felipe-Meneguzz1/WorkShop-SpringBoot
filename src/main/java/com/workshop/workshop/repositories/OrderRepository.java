package com.workshop.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
