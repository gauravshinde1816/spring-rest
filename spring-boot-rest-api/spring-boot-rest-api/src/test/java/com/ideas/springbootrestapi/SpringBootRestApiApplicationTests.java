package com.ideas.springbootrestapi;

import com.ideas.springbootrestapi.entities.Course;
import com.ideas.springbootrestapi.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;


@SpringBootTest
class SpringBootRestApiApplicationTests {


	@Autowired
	private CourseRepository courseRepository;

	@Test
	void testCourseInsert() {


		Course course = new Course();

		course.setCourseID(1423l);
		course.setCourseName("Intro to Java");
		course.setAuthor("john Doe");

		courseRepository.save(course);

		Course course1 = courseRepository.findById(1423L).get();

		AssertionErrors.assertNotNull("" , course1);

	}



}
