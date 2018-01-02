package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.service.NewServiceImpl;

public abstract class BaseController {
	@Autowired
	NewServiceImpl fn;
}