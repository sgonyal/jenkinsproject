package com.cjc.crud.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	public List<Student> findByUsernameAndPassword(String username,String password);
	public Student findByRollno(int rollno);
}
