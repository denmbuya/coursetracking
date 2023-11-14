package com.course.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "course_category")
    private String category;

    @Column(name = "rating")
    private int rating;

    @Column(name = "course_description")
    // @Transient
    private String description;

}
