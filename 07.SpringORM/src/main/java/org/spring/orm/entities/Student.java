package org.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int stuId;

	@Column(name = "student_name")
	private String stuName;

	@Column(name = "student_city")
	private String city;

	@Column(name = "student_state")
	private String state;

	public Student() {
		super();
	}

	public Student(int stuId, String stuName, String city, String state) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.city = city;
		this.state = state;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", city=" + city + ", state=" + state + "]";
	}

}
