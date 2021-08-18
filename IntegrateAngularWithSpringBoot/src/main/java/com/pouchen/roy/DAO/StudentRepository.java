package com.pouchen.roy.DAO;

import org.springframework.data.repository.CrudRepository;

import com.pouchen.roy.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
}
