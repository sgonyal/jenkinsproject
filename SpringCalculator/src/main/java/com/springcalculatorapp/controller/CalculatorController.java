package com.springcalculatorapp.controller;
import com.springcalculatorapp.SpringCalculatorApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CalculatorController {

   

	@RequestMapping("/")
	public String preHome()
	{
		return "home";
	}
	
	@RequestMapping("/addition")
	public String preAddition()
	{
		return "addition";
	}
	
	@RequestMapping("/subtraction")
	public String preSubtraction()
	{
		return "subtraction";
	}
	
	@RequestMapping("/multiplication")
	public String preMultiplication()
	{
		return "multiplication";
	}
	
	@RequestMapping("/division")
	public String preDivision()
	{
		return "division";
	}
	
	
	@RequestMapping("/addnumber")
	public String additionPage(@RequestParam("firstnumber") int fnm,@RequestParam("secondnumber") int snm,Model m)
	{
		int result=fnm + snm;
		System.out.println(result);
		m.addAttribute("resadd",result);
		return "success";
	}
	
	@RequestMapping("/subnumber")
	public String subtractionPage(@RequestParam("firstnumber") int fnm,@RequestParam("secondnumber") int snm,ModelMap m)
	{
		int result = fnm - snm;
		System.out.println(result);
		m.addAttribute("ressub",result);
		return "success";
	}
	
	@RequestMapping("/mulnumber")
	public String multiplicationPage(@RequestParam("firstnumber") int fnm,@RequestParam("secondnumber") int snm,ModelMap m)
	{
		int result = fnm * snm;
		System.out.println(result);
		m.addAttribute("resmul",result);
		return "success";
	}
	
	@RequestMapping("/divnumber")
	public String divisionPage(@RequestParam("firstnumber") int fnm,@RequestParam("secondnumber") int snm,ModelMap m)
	{
		int result = fnm / snm;
		System.out.println(result);
		m.addAttribute("resdiv",result);
		return "success";
	}
}
