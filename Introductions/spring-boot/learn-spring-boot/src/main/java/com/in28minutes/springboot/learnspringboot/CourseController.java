package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"), 
				new Course(2, "Learn DevOps", "in28minutes"),
				new Course(3, "Learn Azure", "in28minutes"),
				new Course(4, "Learn GCP", "in28minutes")
				);
	}

}
