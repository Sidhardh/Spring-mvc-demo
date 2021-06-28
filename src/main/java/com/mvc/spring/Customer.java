package com.mvc.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mvc.spring.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message = "is Required Field")
	@Size( min= 1,message = "* is Required")
	private String lastName;
	
	@NotNull(message = "is Required Field")
	@Min(value=0,message="must be >= 0")
	@Max(value=10,message="Must be <= 10")
	private int freePasses;
	
	
	@NotNull(message = "is Required Field")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only chars and numbers of 5 digit")
	private String postalCode;
	
	@NotNull(message = "Field Can't be empty")
	@CourseCode(value="SID",message="Field Can Strat with SID")
	private String coursecode;
	
	
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
