package com.tanmay.TanDrugPharma.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandling(Exception exception, WebRequest request){
		ExceptionDetails ed = 
				new ExceptionDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(ed, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}	