package com.example.milestone3.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerNotFoundResponse {
	private HttpStatus status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd:hh:mm:ss")
	private LocalDateTime timeStamp;
	private String message;

	public CustomerNotFoundResponse(HttpStatus status) {
		this.status = status;
	}

	public CustomerNotFoundResponse() {
		this.timeStamp = LocalDateTime.now();
	}

	public CustomerNotFoundResponse(HttpStatus status, LocalDateTime timeStamp, String message) {
		this.status = status;
		this.timeStamp = timeStamp;
		this.message = message;
	}

	public CustomerNotFoundResponse(HttpStatus notFound, String message2) {
		this.status = notFound;
		this.timeStamp = LocalDateTime.now();
		this.message = message2;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}}