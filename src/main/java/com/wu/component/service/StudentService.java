package com.wu.component.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wu.component.dao.StudentDao;

@Component
public class StudentService {
	@Autowired
	public StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;	
	}
	
	@Override
	public String toString() {
		return "This is StudentService ["+this.dao+"]";
	}
}
