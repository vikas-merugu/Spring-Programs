package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
      
       Person person1=context.getBean("person1",Person.class);
       person1.PersonInfo();
       
       Person person2=context.getBean("person2",Person.class);
       person2.PersonInfo();
       
       Person person3=context.getBean("person3",Person.class);
       person3.PersonInfo();
       

    }
}
