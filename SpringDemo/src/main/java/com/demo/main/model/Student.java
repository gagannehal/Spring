package com.demo.main.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private int rollNum;
	@Autowired
	Teacher teacher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	

}
