package com.zee.zee5app.exception;

import lombok.ToString;

@ToString(callSuper = true)
public class InvalidIdLengthException extends Exception 
{
	//user defined
	public InvalidIdLengthException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	/*
	 *
	@Override
	public String toString() {
		return "IdNotFoundException [toString()=" + super.toString() + "]";
	}
	*/
	
	

}
