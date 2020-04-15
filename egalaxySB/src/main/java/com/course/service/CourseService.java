package com.course.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.course.entity.Course;

public interface CourseService {

	List<Course> getallCourses();
	
	Optional<Course> getCourseById(long id);
	
	Course createCourse(Course course);
	
	Course updateCourse(Course course);
	
	void deleteCourse(long id);
	
	
}
