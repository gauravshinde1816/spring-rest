package com.ideas.springbootrestapi;


import com.ideas.springbootrestapi.entities.Course;
import com.ideas.springbootrestapi.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {


    @Autowired
    private CourseRepository courseRepository;
    @GetMapping("")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/{id}")
    public  Course getCourseById(@PathVariable String id){
        return  courseRepository.findById(Long.parseLong(id)).get();
    }
    @PostMapping("")
    public void createCourse(   @RequestBody  Course course){
        courseRepository.save(course);
    }
    @PutMapping("/{id}")
    public void updateCourse(   @RequestBody  Course course){
        courseRepository.save(course);
    }
    @DeleteMapping("/{id}")
    public  void deleteCourseById(@PathVariable String id){
          courseRepository.deleteById(Long.parseLong(id));
    }


}
