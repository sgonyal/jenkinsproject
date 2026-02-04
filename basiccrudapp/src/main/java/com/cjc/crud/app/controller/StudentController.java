package com.cjc.crud.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.app.model.Student;
import com.cjc.crud.app.service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	StudentServiceI service;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String preRegister()
	{
		return "register";
	}
	
	@RequestMapping("/studentsave")
	public String saveStudent(@ModelAttribute Student student)
	{
		System.out.println("started");
		service.saveStudent(student);
		System.out.println("Ended");
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginStudent(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
	{
	 List<Student> list=service.loginStudent(username,password);
	 
	 if(!list.isEmpty())
	 {
		 m.addAttribute("sdata", list);
		 
	 }else
	 {
		 return "login";
	 }
	 return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rollno") int rollno,Model m)
	{
		List<Student> list = service.deleteStudent(rollno);
		m.addAttribute("sdata", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("rollno") int rollno,Model m)
	{
		Student stu=service.editStudent(rollno);
		m.addAttribute("sdata", stu);
		return "update";
	}
	
	@RequestMapping("/studentupdate")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{
		List<Student> stulist=service.updateStudent(s);
		m.addAttribute("sdata", stulist);
		return "success";
	}
	
	
	
	
}
