package com.exam.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.component.Exam;
import com.student.component.Student;


public class TesterMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/springannotations.xml");
        Exam exam = (Exam) context.getBean("examobject");
        System.out.println(exam);
        
        Student stu = (Student) context.getBean("studentobj");
        System.out.println(stu);
        
        ((ClassPathXmlApplicationContext) context).close();

	}

}
