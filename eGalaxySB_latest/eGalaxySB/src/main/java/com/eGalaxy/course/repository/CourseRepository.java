package com.eGalaxy.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eGalaxy.course.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> 
{

}
