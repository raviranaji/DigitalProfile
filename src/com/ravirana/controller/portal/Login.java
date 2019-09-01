package com.ravirana.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("Home Page Requested");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("portal");
		return mv;
	}
}
