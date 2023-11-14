package com.course.tracker.service;

import java.util.Optional;
import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;

import com.course.tracker.entity.Course;
import com.course.tracker.repository.CourseRepository;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.DistributionSummary;

public class DefaultCourseService /* implements CourseService */ {

    private final CourseRepository courseRepository;
    private final Counter createCourseCounter;
    private final Timer createCourseTimer;
    private final DistributionSummary distributionSummary;

    @Autowired
    public DefaultCourseService(CourseRepository courseRepository,
            Counter createCourseCounter,
            Timer createCourseTimer,
            DistributionSummary distributionSummary) {
        this.courseRepository = courseRepository;
        this.createCourseCounter = createCourseCounter;
        this.createCourseTimer = createCourseTimer;
        this.distributionSummary = distributionSummary;
    }

}