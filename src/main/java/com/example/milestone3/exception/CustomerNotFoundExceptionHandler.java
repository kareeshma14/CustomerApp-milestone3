package com.example.milestone3.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice()
public class CustomerNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<Object> handleNoSuchElementException(HttpServletRequest request, CustomerNotFoundException ex) {
		return buildExceptionResponse(
				new CustomerNotFoundResponse(HttpStatus.NOT_FOUND, LocalDateTime.now(), ex.getMessage()));
	}

	public ResponseEntity<Object> buildExceptionResponse(CustomerNotFoundResponse response) {
		return new ResponseEntity<Object>(response, response.getStatus());
	}}
