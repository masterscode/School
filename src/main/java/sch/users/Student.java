package sch.users;

import sch.academics.Course;
import sch.interfaces.StudentInterface;

public class Student implements StudentInterface {


    @Override
    public void takeCourse(User student, Course course) {
        try {
            if (student.userType.equals("student")) {
                student.courses.add(course);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}