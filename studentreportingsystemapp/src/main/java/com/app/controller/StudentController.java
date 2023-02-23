package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.exception.StudentException;
import com.app.model.Student;
import com.app.model.semester1;
import com.app.model.semester2;
import com.app.service.StudentService;




@Controller
public class StudentController {
	
	@Autowired
	private StudentService sService;

	@RequestMapping("/")
	public String home() {
		return "HomePage";
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) throws StudentException {
	   Student result = sService.addStudent(student);
	   return new ResponseEntity<Student>(result,HttpStatus.CREATED);
	}
	
	@PutMapping("/sem1/{studentId}")
	public ResponseEntity<Student> addSem1Marks(@RequestBody semester1 sem1,@PathVariable("studentId") Integer studenId) throws StudentException {
		Student student = sService.addSem1Marks(sem1,studenId);
		  return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}
	
	@PutMapping("/sem2/{studentId}")
	public ResponseEntity<Student> addSem2Marks(@RequestBody semester2 sem2,@PathVariable Integer studenId) throws StudentException {
		Student student = sService.addSem2Marks(sem2,studenId);
		  return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}
	
	@GetMapping("/average")
	public ResponseEntity<Integer> averageOfClass() {
		   Integer average = sService.averageOfClass();
		return new ResponseEntity<Integer>(average,HttpStatus.OK); 
	}
	
	
	
}
