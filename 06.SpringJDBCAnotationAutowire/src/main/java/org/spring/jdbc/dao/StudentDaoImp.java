package org.spring.jdbc.dao;

import java.util.List;

import org.spring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImp implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

//	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {

		// insert query
		String query = "insert into student(id, name, city) values(?, ?, ?);";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		System.out.println("Number of records Inserted----: "+result);
		
		return result;
	
	}

	@Override
	public int updateData(Student student) {
		
		// update query
		String query = "update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		System.out.println("Number of records Updated----: "+update);
		return update;
	}

	@Override
	public int deleteData(int id) {

		// delete query
		String query = "delete from student where id=?";
		int i = this.jdbcTemplate.update(query, id);
		System.out.println("Record deleted--- ? "+i);
		return i;
	}

	@Override
	public Student getStudentData(int studentId) {

		// select query
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student studentInfo = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		System.out.println("Student----: "+studentInfo);
		return studentInfo;
	}

	@Override
	public List<Student> getAllStudents() {

		// selecting multiple students
		String query = "select * from student";
		List<Student> studentList = this.jdbcTemplate.query(query, new RowMapperImp()); 

		return studentList;
	}

}
