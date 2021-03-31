package sch.academics;

import sch.users.User;

public class Course {
    public String title;
    public User teacher;
    public int courseUnit;
    public int courseCode;

    public Course(String title, int courseUnit, int courseCode) {
        this.title = title;
        this.courseUnit = courseUnit;
        this.courseCode = courseCode;
    }


}