package sch.interfaces;

import sch.academics.Course;
import sch.users.User;

public interface TeacherInterface {
    void assignCourse(User user, Course course);
}
