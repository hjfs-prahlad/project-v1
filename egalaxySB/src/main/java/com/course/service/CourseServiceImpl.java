package com.course.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.course.entity.Course;
import com.course.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public List<Course> getallCourses() {
		
		return courseRepository.findAll();
	}
	
	@Override
	public Optional<Course> getCourseById(long id) {
		
		return courseRepository.findById(id);
	}
	
	@Override
	public Course createCourse(Course course) {
		
		return courseRepository.save(course);
	}
	
	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	@Override
	public void  deleteCourse(long id) {
		courseRepository.deleteById(id);
	}
	
}
