package com.egalaxy.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egalaxy.course.entity.Course;
import com.egalaxy.course.service.CourseService;
import com.egalaxy.course.service.CourseServiceImpl;


@CrossOrigin(value = "/")
@RestController
@RequestMapping(value = "/course")
public class CourseController {

	@Autowired
	CourseService courseService;
	
   @RequestMapping(value = "/all", method = RequestMethod.GET )
	   public List<Course> getallCourses(){
		   return this.courseService.getallCourses();
	   }
   
   @RequestMapping(value = "/create", method = RequestMethod.POST,
		   consumes = MediaType.APPLICATION_JSON_VALUE,
		   produces = MediaType.APPLICATION_JSON_VALUE )
	public Course createCourse(@RequestBody Course course) {
		return this.courseService.createCourse(course);
	}
   
   @RequestMapping(value = "/{id}", method = RequestMethod.GET)
   public Optional<Course> getCourseById(@PathVariable long id){
	   return courseService.getCourseById(id);
   }
   
   @RequestMapping(value = "/update", method = RequestMethod.PUT,
		   consumes = MediaType.APPLICATION_JSON_VALUE,
		   produces = MediaType.APPLICATION_JSON_VALUE)
   public Course updateCourse(@RequestBody Course course) {
	   return this.updateCourse(course);
   }
   
   @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
   public void deleteCoursebyId(long id) {
	   this.courseService.deleteCoursebyId(id);
   }
   
   @RequestMapping(value = "/deleteall", method = RequestMethod.DELETE)
   public void deleteallCourses() {
   this.courseService.deleteallCourses();
   
}
}
