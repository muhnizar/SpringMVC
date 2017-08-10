package com.controller;

import com.constanta.Pages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Page1Controller {
	@RequestMapping(value = "/data-check", method = RequestMethod.GET)
    public ModelAndView saveOrUpdate() throws Exception {
        ModelAndView modelAndView = new ModelAndView(String.format(Pages.PAGE_1.getPath()));
        return modelAndView;
    }
}