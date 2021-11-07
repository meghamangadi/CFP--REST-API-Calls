package com.bridgelabz.demoprogram.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.demoprogram.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello From BridgeLabz";

	}

	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + " From Bridgelabz";
	}

	@RequestMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name + " From Bridgelabz";
	}

	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
	}
	
    @PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,
	                           @RequestParam(value = "lastName") String lastName) {
	    return "Hello " + firstName + " " + lastName + " From bridgeLabz";
	}
}
