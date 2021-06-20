package org.spring.jdbc;

import java.util.List;

import org.spring.jdbc.configuration.JDBCConfiguration;
import org.spring.jdbc.dao.StudentDao;
import org.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
		
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		// insert query
//		String query = "insert into student(id, name, city) values(?, ?, ?);";		
//		// fire query
//		int update = template.update(query, 444, "Jhon", "Delhi");
//		System.out.println("Nor of rows inserted----: "+update);
		
//		------------------------------------------------------------------------------------------
//		insertion data into database
//		------------------------------------------------------------------------------------------
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setId(426);
		student.setName("Ram");
		student.setCity("Ayodhya");
		
//		studentDao.insert(student);

//		------------------------------------------------------------------------------------------
//		update data into database
//		------------------------------------------------------------------------------------------		
		
		Student update = new Student();
		update.setId(426);
		update.setName("Hanuman");
		update.setCity("Ayodhya");
//		int result = studentDao.updateData(update);
//		System.out.println("Record Updated---: "+result);

//		------------------------------------------------------------------------------------------
//		update data into database
//		------------------------------------------------------------------------------------------		
		
//		int deleteData = studentDao.deleteData(426);
//		System.out.println("Record Deleted---: "+deleteData);

//		------------------------------------------------------------------------------------------
//		select single row from database
//		------------------------------------------------------------------------------------------		
		
		Student studentData = studentDao.getStudentData(444);
		System.out.println("Student Record---: "+studentData);
		
//		------------------------------------------------------------------------------------------
//		select multiple row from database
//		------------------------------------------------------------------------------------------		
		
		List<Student> allStudents = studentDao.getAllStudents();

		for (Student student2 : allStudents) {
			System.out.println("Multiple Records----: "+student2);
		}
		
	}

}
