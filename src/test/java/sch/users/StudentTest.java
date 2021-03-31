package sch.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sch.academics.Course;

class StudentTest {
    Student studentActions;
    User teacher;
    User student;
    Course course;
    @BeforeEach
    void setUp(){
        course = new Course("OOP with Java",3, 101);
        teacher = new User("taiwo", "tosin", "male", "email", 900, "teacher");
        studentActions = new Student();
        student = new User("sophia", "paul", "female", "email", 999, "student");
    }

    @Test
    @DisplayName("this method should add one course to the collections of courses")
    void takeCourse() {
        studentActions.takeCourse(student, course);
        int actual  = student.courses.size();
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }
}