package com.ideas.springbootrestapi.repositories;

import com.ideas.springbootrestapi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,  Long> {
}
