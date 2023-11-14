package com.course.tracker.service;


import com.course.tracker.entity.Course;
import com.course.tracker.repository.CourseRepository;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@DataJpaTest
public class CourseRepositoryTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService; // Assuming you have a service that uses the repository

    @Test
    public void testFindAllByCategory() {
        // Arrange
        String category = "Programming";
        Course course1 = new Course(1, "Java Fundamentals", category, 4, "Introduction to Java programming.");
        Course course2 = new Course(2, "Spring Boot Basics", category, 5, "Getting started with Spring Boot.");
        List<Course> courses = Arrays.asList(course1, course2);

        when(courseRepository.findAllByCategory(anyString())).thenReturn(courses);

        // Act
        Iterable<Course> result = courseService.getCourseByCategory(category);

        // Assert
        assertThat(result).hasSize(2);
        assertThat(result).contains(course1, course2);
    }
}
