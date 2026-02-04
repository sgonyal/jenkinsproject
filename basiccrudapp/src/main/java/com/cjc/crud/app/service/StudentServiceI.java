package com.cjc.crud.app.service;


import java.util.List;
import java.util.Optional;

import com.cjc.crud.app.model.Student;

public interface StudentServiceI {

	public void saveStudent(Student student);

	public List<Student> loginStudent(String username, String password);

	public List<Student> deleteStudent(int rollno);

	public Student editStudent(int rollno);

	public List<Student> updateStudent(Student s);

	
	
}
