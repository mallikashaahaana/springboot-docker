package com.mars.springboot.rest.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mars.springboot.rest.Account;
import com.mars.springboot.rest.Type;
@Service
public class WelcomeService {
	public ResponseEntity<String> checkInputAndReturnResponse(int id,Type type,Account account) {
		if(id>0 && Account.personal.equals(account)) {
			return new ResponseEntity<String>(String.format("Hi, userid %d",id),HttpStatus.OK);
		}
		else  if(Account.business.equals(account) && Type.big.equals(type)){
			return  new ResponseEntity<String>("Welcome, Business User!",HttpStatus.OK);
		}
		return  new ResponseEntity<String>("The Path is not yet implemented",HttpStatus.BAD_REQUEST);
	}
}
