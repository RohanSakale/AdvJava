package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studrepo;
	
	@Override
	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studrepo.findAll();
	}

	@Override
	public Student addstudent(Student obj) {
		// TODO Auto-generated method stub
		return  studrepo.save(obj);
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		if(studrepo.existsById(id)) {
			studrepo.deleteById(id);
			return "deleted succefully";
		}
		return " unsuccefully";
		
		
	}
	

		
	
	

}

