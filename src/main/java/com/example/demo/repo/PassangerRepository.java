package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

}