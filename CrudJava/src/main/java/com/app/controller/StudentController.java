package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@GetMapping
	public List<Student> getAllStudent(){
		return studentservice.getAllStudentDetails();
	}
	
	@PostMapping
	public Student AddStudent(@RequestBody Student sobj){
		return studentservice.addstudent(sobj);
	}
	
	@DeleteMapping
	public String deletebyId(Long id){
		return studentservice.delete(id);
	}
	


}
