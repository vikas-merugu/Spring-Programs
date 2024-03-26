package com.sathya.springex2;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	public void message() {

		System.out.println("Messages will receive");
		
	}

	

	

	

}
