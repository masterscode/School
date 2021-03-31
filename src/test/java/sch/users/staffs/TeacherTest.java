package sch.users.staffs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sch.academics.Course;
import sch.users.User;

class TeacherTest {
    Teacher teacherActions;
    User teacher;
    Course course;
    @BeforeEach
    void init(){
        teacher = new User("taiwo", "tosin", "male", "email", 900, "teacher");
        teacherActions = new Teacher();
        course = new Course("OOP with Java",3, 101);
    }
    @Test
    @DisplayName("")
    void assignCourse(){
        teacherActions.assignCourse(teacher, course);
        User actual = course.teacher;
        User expected = teacher;
        Assertions.assertEquals(actual, expected);
    }
}