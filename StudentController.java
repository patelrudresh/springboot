package com.example.Demo10;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getall() {
		return new Student("rudresh" ,"patel");

	}
	
	@GetMapping("/allStudent")
	public List<Student> getallstudent() {
		List<Student> student =new ArrayList<>();
		student.add(new Student("rudresh ","patel"));
		student.add(new Student("anshul ","patel"));
		student.add(new Student("abhay	 ","patel"));
		student.add(new Student("abhi ","patel"));
		student.add(new Student("abhi ","patel"));
		student.add(new Student("ankus","patel"));
		return student;
	} 
	
	@GetMapping("Student /{firstname}/{Lastname}")
	public Student getpath(@PathVariable("firstname") String firstname,@PathVariable("Lastname")String Lastname) {
		return new Student (firstname,Lastname);
	}
	
	@GetMapping("quey")
	public Student qurypath( @RequestParam(name="name")String name ,
			                 @RequestParam(name ="lastname") String lastname) {
		return new Student(name,lastname);
	}
}
