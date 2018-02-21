package springbootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import springbootmvc.service.NewServiceImpl;

public abstract class BaseController {
	@Autowired
	NewServiceImpl fn;
}