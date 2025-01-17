package com.workshop.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.workshop.entities.OrderItem;
import com.workshop.workshop.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}