package com.pouchen.roy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pouchen.roy.DAO.StudentRepository;
import com.pouchen.roy.Model.Student;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll().forEach(student -> students.add(student));
		return students;
	}
	
	public Student getStudentById(Student student) {
		Optional<Student> studentOptional = studentRepository.findById(student.getStudent_id());
		
		return (studentOptional.isPresent()==false)?
				null:studentOptional.get();
	}
	
	public void deleteStudent(Student student) {
		studentRepository.deleteById(student.getStudent_id());
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
}
