package com.example.milestone3.exception;

public class CustomerNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String id) {
		super(id);
	}}