package com.course.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.tracker.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    Iterable<Course> findAllByCategory(String category);
}
