package camt.cbsd.services;

import camt.cbsd.entity.Course;

import java.util.List;


public interface CourseService {
    List<Course> list();
    Course add(Course course);
}
