package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.constanta.Pages;

@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getPage(){
		ModelAndView modelAndView = new ModelAndView(
                String.format(Pages.INDEX.getPath()));
		return modelAndView;
	}
}
