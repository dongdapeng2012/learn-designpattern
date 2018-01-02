package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dao.NewDao;

public abstract class BaseServiceImpl {
	@Autowired
	NewDao newDao;
}
