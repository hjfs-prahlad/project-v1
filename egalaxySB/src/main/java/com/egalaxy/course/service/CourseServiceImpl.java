package com.egalaxy.course.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.egalaxy.course.entity.Course;
import com.egalaxy.course.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	@Transactional
	public List<Course> getallCourses() {
		
		return courseRepository.findAll();
	}
	
	@Override
	@Transactional
	public Optional<Course> getCourseById(long id) {
		
		return courseRepository.findById(id);
	}
	
	@Override
	@Transactional
	public Course createCourse(Course course) {
		
		return courseRepository.save(course);
	}
	
	@Override
	@Transactional
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	@Override
	public void  deleteCoursebyId(long id) {
		courseRepository.deleteById(id);
	}
	
	@Override
	@Transactional
	public void deleteallCourses() {
		courseRepository.deleteAll();
		
	}
}
