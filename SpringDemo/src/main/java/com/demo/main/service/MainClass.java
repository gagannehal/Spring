package com.demo.main.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.main.model.Student;
import com.demo.main.model.Teacher;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Student s = (Student)context.getBean("student");
		System.out.println(s.getName());
		Teacher t = (Teacher)context.getBean("Teacher");
		System.out.println(t.getName());
	}

}
