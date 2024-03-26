package com.sathya.servletsex.SpringExample1;

public class GreetingImpl implements Greeting {
	@Override
	public void greet()
	{
	System.out.println("This is Spring First Example");
	
	}
	public GreetingImpl()
	{
		System.out.println("Greeting implement constructor::object created");
	}
	
	
	

}
