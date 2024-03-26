package com.sathya.springex2;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		
		System.out.println("Java Full Stack");
		
	}
	
	

}
