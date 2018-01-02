package com.student.service;

import org.springframework.stereotype.Service;

@Service("service")
public class NewServiceImpl extends BaseServiceImpl {
	public String test() {
		return newDao.test();
	}
}