package org.javasavvy.tutorial.ui.controller;

import org.javasavvy.tutorial.dao.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	HelloWorld hello;

	@RequestMapping(method=RequestMethod.GET,value="/home")
	public String getHomePage(){
		System.out.println(hello.sayHello("kbytes"));
		return "home";
	}
	
	@GetMapping("contacts")
	public String getContactPage(){
		return "contacts";
	}
}
