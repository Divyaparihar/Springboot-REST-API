package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
//		list=new ArrayList<>();
//		list.add(new Course(1, "Core Java", "It contains all the core concept of Java"));
//		list.add(new Course(2, "Advance Java", "It contains all the advance concept of Java"));
//	
		}

    @Override
	public List<Course> getCourses() {
//		return list;
    	return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		
//		return c;
		return courseDao.getOne(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
		
	}
	
	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//			   e.setTitle(course.getTitle());
//			   e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		
		return course;
	}
	

	
	@Override
	public void deleteCourse(long parseLong) {
//	    list = list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	
	}


	

}
