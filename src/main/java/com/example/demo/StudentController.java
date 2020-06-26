package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ser;
	
	@PostMapping
	public StudentEntity addStudent(@RequestBody StudentEntity s)
	{
		return ser.addStudent(s);
		
	}
	
	@GetMapping
	public List<StudentEntity> getAllDetails()
	{
		return ser.getAllDetails();
	}
	
	@GetMapping("/{StudId}")
	public StudentEntity getById(@PathVariable Integer StudId) {
		return ser.getById(StudId);
		
	}
	
	@PutMapping("/{StudId}")
	public StudentEntity StudentUpdate(@RequestBody StudentEntity s,@PathVariable Integer StudId) {
		return ser.StudentUpdate(s,StudId);
		
	}

	@DeleteMapping("/{StudId}")
	public void deleteStudent(@PathVariable Integer StudId) {
		 ser.deleteStudent(StudId);
		
	}
}
