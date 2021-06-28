package com.mvc.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowWorldController {

	//initial Form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
		
	}

	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
		
	}
	@RequestMapping("/processFormProcess")
	public String callTheName(HttpServletRequest  request,Model model)
	{
		String theName=request.getParameter("studentName");
		String result="Heloow - "+theName.toUpperCase();
		model.addAttribute("message",result);
		return "helloworld";
		
	}
	@RequestMapping("/processFormProcessTwo")
	public String processFormProcessTwo(@RequestParam("studentName") String theName,Model model)
	{
		System.out.println(theName);
		//String theName=request.getParameter("studentName");
		String result="Heloow - "+theName.toUpperCase();
		model.addAttribute("message",result);
		return "helloworld";
		
	}
}
