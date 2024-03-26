package com.sathya.springex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	
	@Bean
	public EmailService emailServices()
	{
		EmailService emailService=new EmailService();
		return emailService;
				
				
	}
	@Bean
	public JavaCourseService courseService()
	{
		JavaCourseService javaCourseService=new JavaCourseService();
		return javaCourseService;
	}
	@Bean
	public Student student()
	{
		Student student= new Student();
		student.setEmailservices(emailServices());
		student.setJavacourseService(courseService());
		return student;
	}
	
	
	
	

}
