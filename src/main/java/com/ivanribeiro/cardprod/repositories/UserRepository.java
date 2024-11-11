package com.ivanribeiro.cardprod.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanribeiro.cardprod.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
