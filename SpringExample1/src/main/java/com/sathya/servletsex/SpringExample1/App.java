package com.sathya.servletsex.SpringExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-Config.xml");
        System.out.println( "********" );
        //Get the objects from container call your methods.
        GreetingImpl  greetingimpl=context.getBean("greet",GreetingImpl.class );
        greetingimpl.greet();
    }
}
