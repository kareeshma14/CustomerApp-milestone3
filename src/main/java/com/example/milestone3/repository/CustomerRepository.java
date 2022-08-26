package com.example.milestone3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.milestone3.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
