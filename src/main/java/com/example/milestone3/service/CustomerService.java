package com.example.milestone3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.milestone3.entity.Customer;
import com.example.milestone3.exception.CustomerNotFoundException;
import com.example.milestone3.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public List<Customer> getAll() {
		return repository.findAll();
	}
	
	public Customer getById(long id) {
		Optional<Customer> customer = repository.findById(id);
		if (customer.isEmpty())
			throw new CustomerNotFoundException("No customer is present for this id: " + id);
		return customer.get();
	}
	public Customer save(Customer customer) {
		Customer cus = repository.save(customer);
		return cus;
	}

	
}
