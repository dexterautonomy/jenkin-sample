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
}
