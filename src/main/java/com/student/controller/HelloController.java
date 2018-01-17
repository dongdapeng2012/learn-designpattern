package com.student.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
@Controller
public class HelloController extends BaseController {

	@RequestMapping("/hello")
	public String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	public String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}

	@RequestMapping("/new")
	public String test() {

		return fn.test();
	}
}