package com.pouchen.roy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pouchen.roy.Model.Student;
import com.pouchen.roy.service.StudentService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save-student")
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping("/student-list")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@PostMapping("/delete-student/{student_id}")
	public void deleteStudent(@PathVariable("student_id") int student_id, Student student) {
		student.setStudent_id(student_id);
		studentService.deleteStudent(student);
	}
	
	@GetMapping("/student/{student_id}")
	public Student allStudentsById(@PathVariable("student_id")int student_id, Student student) {
		student.setStudent_id(student_id);
		return studentService.getStudentById(student);
		
	}
	
	@PostMapping("/update-student/{student_id}")
	public void updateStudent(@RequestBody Student student, @PathVariable("student_id") int student_id) {
		student.setStudent_id(student_id);
		
		studentService.updateStudent(student);
	}
	
	
	
	
	
	
}
