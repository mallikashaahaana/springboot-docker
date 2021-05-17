package com.mars.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InputValueInvalidController{
	
	 @ExceptionHandler(value = InputValueInvalidException.class)
	   public ResponseEntity<Object> exception(InputValueInvalidException exception) {
	      return new ResponseEntity<>("Input Value is invalid", HttpStatus.BAD_REQUEST);
	   }
}
