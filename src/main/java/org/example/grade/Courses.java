package org.example.grade;

import java.util.List;

public class Courses {
    private final List<Course> cources;

    public Courses(List<Course> cources) {
        this.cources = cources;
    }

    public double multiplyCreditAndCourseGrade() {
        return cources.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return cources.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
