package com.mvc.spring;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//intibinder to remove whitespaces
	//@initbinder will be executed first
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Customer theCustomer=new Customer();
		model.addAttribute("customer",theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/validateCustomer")
	public String validateAndSubmit(@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult theBindingResult)
	{
		System.out.println("The Customer LastName |"+theCustomer.getLastName()+"|");
		
		if(theBindingResult.hasErrors())
		{
			System.out.println("Binding Result"+theBindingResult+"\n\n\n\n");
			return "customer-form";
		}
		else
		{
			return "customer-details";
		}
		
		
	}
}
