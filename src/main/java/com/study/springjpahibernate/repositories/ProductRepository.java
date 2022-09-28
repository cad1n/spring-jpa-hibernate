package com.study.springjpahibernate.repositories;

import com.study.springjpahibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
