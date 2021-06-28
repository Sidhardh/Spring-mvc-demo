package com.mvc.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class courseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

	private String coursePrefix ;
	 @Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix=theCourseCode.value();
		
		
		//ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode!=null)
		{
		 result=theCode.startsWith(coursePrefix);
		}
		else
		{
			result= true;
		}
		return result;
	}

}
