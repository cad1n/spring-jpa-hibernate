package com.study.springjpahibernate.repositories;

import com.study.springjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
