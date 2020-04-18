package com.eGalaxy.course.service;

import java.util.List;
import java.util.Optional;

import com.eGalaxy.course.entity.Course;

public interface CourseService {

	List<Course> getCourses();

	Optional<Course> getCourseById(long id);

	Course createCourse(Course course);

	Course updateCourse(Course course);

	void delete(Course course);

	void delete();
}
