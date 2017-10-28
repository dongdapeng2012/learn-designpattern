package com.student.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class Entrance extends BaseController {

	@RequestMapping("/hello")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}

	@RequestMapping("/new")
	String forNew() {

		return fn.test();
	}

	@RequestMapping("/new2")
	void forNew2() {

		fn.test2();
	}
}