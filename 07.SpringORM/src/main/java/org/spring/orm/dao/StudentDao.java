package org.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.spring.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {

		// Insert Data
		Integer result = (Integer) this.hibernateTemplate.save(student);
		System.out.println("Record saved in db---? " + result);
		return result;
	}
	
	// Get Single Student Data
	public Student getStudentData(int studentId) {

		Student student = this.hibernateTemplate.get(Student.class, studentId);
		System.out.println("Student info---: "+student);
		return student;
	}
	
	// Get All Student Data	
	public List<Student> getAllStudentList(){
		
		List<Student> loadAllStudents = this.hibernateTemplate.loadAll(Student.class);
		System.out.println("Student List--: "+loadAllStudents);
		return loadAllStudents;
	}

	// Delete Single Student Data
	@Transactional
	public Student deleteStudentData(int studentId) {

		Student student = this.hibernateTemplate.get(Student.class, studentId);
		System.out.println("Student info---: "+student);
		this.hibernateTemplate.delete(student);
		return student;
	}

	// Update Single Student Data
	@Transactional
	public Student updateStudentData(Student student) {

		this.hibernateTemplate.update(student);
		System.out.println("Student updated---? "+student);

		return student;
	}
	
	
}
