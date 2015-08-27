package com.rukmini.hibernateproject.Student;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="STUDENTUSER")
public class StudentUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentId;
	private String studentName;
	private int age;
	private String college;

	public StudentUser() {

	}

	public StudentUser(int studentId, String studentName, int age,
			String college) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.college = college;
	}
@Id
@Column(name="STUDENT_ID",unique=true,nullable=false,precision=5,scale=0)
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Column(name="STUDENT_NAME",nullable=false,length=20)
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Column(name="AGE",nullable=false,length=3)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="COLLEGE",nullable=false,length=20)
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
@Override
public String toString() {
	return "studentname is :"+studentName+"\n"+"studentId is"+studentId+"\n"+"age is:" + age +"\n"+"college is :"+college;
}
}
