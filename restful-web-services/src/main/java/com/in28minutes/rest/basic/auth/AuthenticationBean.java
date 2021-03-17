package com.in28minutes.rest.basic.auth;

public class AuthenticationBean{

	private String message;
	
	//Constructor
	public AuthenticationBean(String message) {
		this.message = message;
	}
	
	//Updates 
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	
}
