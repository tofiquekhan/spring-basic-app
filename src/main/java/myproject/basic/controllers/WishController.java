package myproject.basic.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;

public class WishController implements org.springframework.web.servlet.mvc.Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		ModelAndView mav = new ModelAndView("wish", "message", "Welcome to Spring Web MVC World");
		return mav;
	}

}
