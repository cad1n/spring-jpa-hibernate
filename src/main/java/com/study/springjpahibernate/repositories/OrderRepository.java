package com.study.springjpahibernate.repositories;

import com.study.springjpahibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
