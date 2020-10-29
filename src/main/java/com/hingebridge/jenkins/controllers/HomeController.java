package com.hingebridge.jenkins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jenkins")
public class HomeController
{
	@RequestMapping("home")
	public String home(ModelMap model)
	{
		return "pages/home";
	}
	
	@RequestMapping("next")
	public String next(ModelMap model)
	{
		model.addAttribute("data", "Welcome to next page!");
		return "pages/register";
	}
}
