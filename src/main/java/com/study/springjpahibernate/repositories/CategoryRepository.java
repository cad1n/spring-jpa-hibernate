package com.study.springjpahibernate.repositories;

import com.study.springjpahibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
