package com.lucianoalfredo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianoalfredo.course.entities.User;

public interface UserRepository  extends JpaRepository<User,  Long>{

}
