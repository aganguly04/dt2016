package com.musichub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	 @RequestMapping("/welcome")
		public ModelAndView  helloworld()
	{
		ModelAndView model=new ModelAndView("index");
		model.addObject("msg","Hello World");
		return model;


	}
}
