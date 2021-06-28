package com.mvc.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = courseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	//define attribute to annotation
	public  String value() default "LUV";
	//default errors
	
	public String message() default "must Start with LUV";
	
	
	
	//define for groups
	public Class<?>[] groups() default {};
	
	//define for payload
	public Class<? extends Payload>[] payload() default {};
	
}
