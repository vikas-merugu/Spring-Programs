package com.sathya.springex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	private EmailService emailservices;
	@Autowired
	private JavaCourseService javacourseService;
	
	
	

	public void details() {
		emailservices.message();
		javacourseService.courseInfo();
	}

}
