package com.snack.logic;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping("/welcome/{countryName}/{userName}")
	protected ModelAndView hello(
			HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse, 
			@PathVariable Map<String, String> pathPars) throws Exception {

		String pageName = "HelloPage";
		String userName = pathPars.get("userName");
		String countryName = pathPars.get("countryName");
		
		ModelAndView modelAndView = new ModelAndView(pageName);
		
		
		// Form the output
		String msg = "Hi user, welcome to the Spring MVC Application";
		msg += "\nYour name is: " + userName;
		msg += "\nYou are from: " + countryName;
		
		modelAndView.addObject("welcomeMessage", msg);
		
		return modelAndView;
	}
}