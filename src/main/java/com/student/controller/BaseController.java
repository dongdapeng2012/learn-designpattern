package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.service.forNew;

public abstract class BaseController {
	@Autowired
	forNew fn;
}