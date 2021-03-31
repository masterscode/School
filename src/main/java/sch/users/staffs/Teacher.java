package sch.users.staffs;

import sch.academics.Course;
import sch.interfaces.TeacherInterface;
import sch.users.User;

public class Teacher extends Staff implements TeacherInterface {

    @Override
    public void assignCourse(User user, Course course) {
        if (user.getUserType().equals("teacher")) {
            course.teacher = user;
        }
    }
}
