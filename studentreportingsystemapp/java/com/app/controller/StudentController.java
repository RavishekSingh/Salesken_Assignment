package com.app.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Student;
import com.app.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository sRepo;

	@GetMapping("/saveStudent")
	public String saveStudent() {
		return "Student Saved";

	}

	@PostMapping("/saveStudent")
	public String saveStudent(@RequestParam Integer studentId, @RequestParam String studentName,
			@RequestParam Integer mathematics, @RequestParam Integer science, @RequestParam Integer english,
			@RequestParam Integer semester) {
		Student student = new Student(studentId, studentName, mathematics, science, english, semester);
		sRepo.save(student);
		return "Welcome Student";

	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";

	}

	@GetMapping("/getPercentage")
	public String getPercentAgeView() {
		return "Percentage";
	}

	@PostMapping("/getPercentage")
	public String getPercent(Model model, @RequestParam Integer semester) {
		int sum = 0;
		int c = 0;
		List<Student> st = sRepo.findBySemester(semester);
		for (Student sts : st) {
			c++;
			sum = sum + sts.getMathematics() + sts.getEnglish() + sts.getScience();
		}
		sum = sum / c;
		sum = sum * 100 / 300;
		model.addAttribute("avg", sum);
		return "Result";
	}

	@GetMapping("/avgMarks")
	public String avgMarks() {

		return "Average_Marks";
	}

	@PostMapping("/avgMarks")
	public String avgMarks(Model model, @RequestParam String subject) {
		Iterable<Student> itr = sRepo.findAll();

		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);
		int c = 0;
		int sum = 0;
		for (Student st : students) {
			System.out.println(st);
			c++;
			if (subject.equalsIgnoreCase("Mathematics")) {
				sum += st.getMathematics();
			} else if (subject.equalsIgnoreCase("English")) {
				sum += st.getEnglish();
			} else if (subject.equalsIgnoreCase("Science")) {
				sum += st.getScience();
			}
		}
		model.addAttribute("avgMarks", sum / c);
		return "AverageResult";
	}

	@GetMapping("/top2")
	public String top2View() {
		return "Top_2";
	}

	@PostMapping("/top2")
	public String top2(Model model) {
		Iterable<Student> itr = sRepo.findAll();

		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);
		HashMap<String, Integer> map = new HashMap<>();
		for (Student st : students) {
			map.put(st.getStudentName(), (st.getMathematics() + st.getEnglish() + st.getScience()) / 3);
		}

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
		// sorting the list elements
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue() - o1.getValue();
			}

		});

		List<String> st = new ArrayList<>();
		int c = 1;
		for (Map.Entry<String, Integer> name:list) {
			if (c <= 2) {
				st.add(name.getKey());
				c++;
			}

		}
		
		model.addAttribute("top2", st);
		return "Top2_Result";
	}
	
	
}
