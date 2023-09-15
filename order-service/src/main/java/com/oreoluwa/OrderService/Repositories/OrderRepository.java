package com.oreoluwa.OrderService.Repositories;

import com.oreoluwa.OrderService.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}