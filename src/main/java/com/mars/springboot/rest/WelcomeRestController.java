package com.mars.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mars.springboot.exception.InputValueInvalidException;
import com.mars.springboot.rest.service.WelcomeService;

@RestController
public class WelcomeRestController {
	@Autowired
	WelcomeService service;
	@GetMapping("/greeting/id/{id}/type/{type}/account/{account}")
	public ResponseEntity<String> greeting(@PathVariable("id")  int id,@PathVariable("type") Type type,@PathVariable("account") Account account ) {
		try {
		return service.checkInputAndReturnResponse(id, type, account);		
		}catch(IllegalArgumentException e) {
			throw new InputValueInvalidException();
		}
		
	}
	@GetMapping("/")
	public ResponseEntity<String> checkAvailability(){
		
		return new ResponseEntity<String>("Its working!!",HttpStatus.OK);
	}
		
	
}
