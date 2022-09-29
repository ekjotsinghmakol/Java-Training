package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/studentsetter.xml");
        Student student = (Student) context.getBean("student1");
        System.out.println(student);
        Exam exam = (Exam) context.getBean("exam1");
        System.out.println(exam);
        
        ApplicationContext context1 = new ClassPathXmlApplicationContext("com/spring/resources/studentconstructor.xml");
        StudentNew student2 = (StudentNew) context1.getBean("stuNew1");
        System.out.println(student2);
        Exam exam2 = (Exam) context1.getBean("exam2");
        System.out.println(exam2);
        
        ((ClassPathXmlApplicationContext) context).close();
        ((ClassPathXmlApplicationContext) context1).close();
	}

}
