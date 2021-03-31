package sch.users;

import sch.academics.Course;
import sch.interfaces.StudentInterface;

import java.util.List;

public class Student implements StudentInterface {


    @Override
    public void takeCourse(User student, Course course) {
        try {
            if (student.getUserType().equals("student")) {
                student.courses.add(course);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Course> getCourses(User student ){
        return student.courses;
    }

}