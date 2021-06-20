package org.spring.jdbc.dao;

import java.util.List;

import org.spring.jdbc.entities.Student;

public interface StudentDao {

	int insert(Student student);
	int updateData(Student student);
	int deleteData(int studentId);
	Student getStudentData(int studentId);
	List<Student> getAllStudents();
}
