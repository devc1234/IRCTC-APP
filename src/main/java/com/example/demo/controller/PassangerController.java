package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passanger;
import com.example.demo.model.Ticket;
import com.example.demo.servises.PassangerServiceI;

@RestController
public class PassangerController {

	@Autowired
	private PassangerServiceI passangerServiceI;

	@PostMapping(value = "bookTicket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg) {
		Ticket bookTicket = passangerServiceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);

	}

}

