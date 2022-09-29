package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/Examcollection.xml");
		ExamCollection examc = (ExamCollection) context.getBean("examcoll1");
		System.out.println(examc);

		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/spring/resources/Studentcollection.xml");
		StudentCollection studentc = (StudentCollection) context1.getBean("studentcoll1");
		System.out.println(studentc);
		
		((ClassPathXmlApplicationContext) context).close();
        ((ClassPathXmlApplicationContext) context1).close();

	}

}
