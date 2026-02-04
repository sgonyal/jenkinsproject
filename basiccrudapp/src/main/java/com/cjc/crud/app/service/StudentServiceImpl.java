package com.cjc.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.crud.app.controller.StudentController;
import com.cjc.crud.app.model.Student;
import com.cjc.crud.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

    

	@Autowired
	StudentRepository repository;

    

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
	}

	@Override
	public List<Student> loginStudent(String username, String password) {
		if(username.equals("admin") && password.equals("admin"))
		{
			return (List<Student>) repository.findAll();
		}else {
		List<Student> list	=repository.findByUsernameAndPassword(username, password);
			return list;
		}
		
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
		repository.deleteById(rollno);
		return (List<Student>) repository.findAll();
	}

//	@Override
//	public Student editStudent(int rollno ) {
//		
//		return repository.findByRollno(rollno);
//	}
	
	@Override
	public Student editStudent(int rollno) {
		
	Optional<Student> op= repository.findById(rollno);
	if(op.isPresent())
	{
	Student s=	op.get();
	return s;
	}else
	{
		return null;
	}
		
	}

	@Override
	public List<Student> updateStudent(Student s) {
		
		repository.save(s);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getUsername());
		System.out.println(s.getPassword());
		
		return (List<Student>) repository.findAll();
	}

	


}
