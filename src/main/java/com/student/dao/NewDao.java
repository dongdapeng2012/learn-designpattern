package com.student.dao;

import org.springframework.stereotype.Repository;

@Repository
public class NewDao {
	public String test() {

		return getStr();
	}

	public String getStr() {
		return "test";
	}
}