package com.snack.logic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value = "/startauthentication", method = RequestMethod.GET)
	protected ModelAndView startAuthenticate(){
		ModelAndView model = new ModelAndView("authentication");
		return model;
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	protected ModelAndView authenticate(
		@RequestParam("login") String login,
		@RequestParam("password") String password){
		
		// TODO Remove this hardcoded strings
		String loginExpected = "user";
		String passwordExpected = "111";
		
		ModelAndView model = null;
		
		if (loginExpected.equals(login) && passwordExpected.equals(password))
		{
			model = new ModelAndView("authenticationSuccess");
		}
		else
		{
			model = new ModelAndView("authenticationFailure");
		}
		return model;
	}
}
