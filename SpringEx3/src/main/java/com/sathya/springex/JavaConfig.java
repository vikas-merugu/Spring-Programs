package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Person person1()
	{
		Person person1=new Person();
		person1.setName("vikas");
		person1.setEmailId("vikas@gmail.com");
		return person1;
	}
	@Bean
	public Person person2()
	{
		Person person2=new Person();
		person2.setName("anshu");
		person2.setEmailId("anshu@gmail.com");
		return person2;
	}
	@Bean
	public Person person3()
	{
		Person person3=new Person();
		person3.setName("vinshu");
		person3.setEmailId("vinshu@gmail.com");
		return person3;
	}
	
	
	

}
