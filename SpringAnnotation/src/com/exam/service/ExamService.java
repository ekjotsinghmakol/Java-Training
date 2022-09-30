package com.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ExamDao;

@Service
public class ExamService {
	@Autowired
	ExamDao examDao;

	public ExamService(ExamDao examDao) {
		super();
		this.examDao = examDao;
	}

	public ExamService() {
	}

	public void addExam() {
		examDao.addExam();
	}

}
