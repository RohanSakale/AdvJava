package com.app.service;

import java.util.List;

import com.app.pojo.Student;

public interface StudentService {
	List <Student> getAllStudentDetails();
	Student addstudent(Student obj);
String  delete(Long id);

}
