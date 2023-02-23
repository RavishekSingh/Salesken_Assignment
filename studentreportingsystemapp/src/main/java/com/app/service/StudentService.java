package com.app.service;

import java.util.List;

import com.app.exception.StudentException;
import com.app.model.Student;
import com.app.model.semester1;
import com.app.model.semester2;

public interface StudentService {

	public Student addStudent(Student student) throws StudentException;

	public Student addSem1Marks(semester1 sem1, Integer studenId) throws StudentException;

	public Student addSem2Marks(semester2 sem2, Integer studenId) throws StudentException;

	public int averageOfClass();

	public String averageOfSubject();

	public List<Student> top2Students();

}
