package com.egalaxy.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSES")
public class Course {
	
	
	
	@Id
	@Column(name = "COURSE_ID")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private  long courseid;

	@Column(name = "COURSE_NAME", nullable = false )
	private String courseName;
	
	@Column(name = "COURSE_DESCRIPTION", nullable = false)
	private String courseDescription;
	
	@Column(name = "COURSE_AUTHOR", nullable = false)
	private String courseAuthor;
	
	@Column(name = "COURSE_PRICE", nullable = false)
	private int  coursePrice;
	
   
	
	public Course() {
		
	}



	public Long getCourseid() {
		return courseid;
	}



	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getCourseDescription() {
		return courseDescription;
	}



	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}



	public String getCourseAuthor() {
		return courseAuthor;
	}



	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
	}



	public int getCoursePrice() {
		return coursePrice;
	}



	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}



	public Course(Long courseid, String courseName, String courseDescription, String courseAuthor, int coursePrice) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseAuthor = courseAuthor;
		this.coursePrice = coursePrice;
	}



	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseAuthor=" + courseAuthor + ", coursePrice=" + coursePrice + "]";
	}



	
	
	
}
