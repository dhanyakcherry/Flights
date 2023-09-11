package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Airline;

public interface AirlineRepo extends JpaRepository<Airline,Long> {

}
