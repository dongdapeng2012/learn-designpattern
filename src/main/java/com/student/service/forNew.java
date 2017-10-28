package com.student.service;

import org.springframework.stereotype.Service;

@Service("forNew")
public class forNew extends BaseServiceImpl {
	public String test(){
		return "forNew";
	}
	
}