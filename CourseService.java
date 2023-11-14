package com.course.tracker.service;

import java.util.Optional;

import com.course.tracker.entity.Course;

public interface CourseService {

    Course createCourse(Course course);

    Optional<Course> getCourseById(long courseId);

    Iterable<Course> getCourseByCategory(String category);

    Iterable<Course> getCourses();

    void updateCourse(long courseId, Course course);

    void deleteCourseById(long courseId);

    void deleteCourses();

    long count();

}
