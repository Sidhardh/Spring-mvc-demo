package com.mvc.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Student theStudent=new Student();
		model.addAttribute("student",theStudent);
		model.addAttribute("theCountryOptions",countryOptions);
		return "student-form";
	}
	
	@RequestMapping("/studentForm")
	public String  studentForm(@ModelAttribute("student") Student theStudent)
	{
		System.out.println(theStudent.getFirstName() +" "+theStudent.getLastName()+"hh"+theStudent.getFavoriteLanguage());
		return "student-confirmation";
		
	}
	
	
}
