package com.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Spring framework", "Sindhu"),
				new Course(2, "Spring boot", "Sindhu"),
				new Course(3, "Spring dev tools", "Sindhu"),
				new Course(4, "Spring dev tools", "Sindhu")
				);
	}
}
