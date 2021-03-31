package store;

import sch.academics.Classes;
import sch.academics.Course;
import sch.users.Applicant;
import sch.users.Student;
import sch.users.staffs.Staff;

import java.util.ArrayList;
import java.util.List;

public class UserStore {
    private List<Student> studentStore = new ArrayList<Student>();
    private List<Staff> staffStore = new ArrayList<Staff>();
    private List<Course> courseStore = new ArrayList<Course>();
    private List<Classes> classStore = new ArrayList<Classes>();
    private List<Applicant> applicantStore = new ArrayList<>();

    public List<Student> getStudentStore() {
        return studentStore;
    }

    public void setStudentStore(Student studentStore) {
        this.studentStore.add(studentStore);
    }

    public List<Staff> getStaffStore() {
        return staffStore;
    }

    public void setStaffStore(Staff staffStore) {
        this.staffStore.add(staffStore);
    }

    public List<Course> getCourseStore() {
        return courseStore;
    }

    public void setCourseStore(Course courseStore) {
        this.courseStore.add(courseStore);
    }

    public List<Classes> getClassStore() {
        return classStore;
    }

    public void setClassStore(Classes classStore) {
        this.classStore.add(classStore);
    }

    public List<Applicant> getApplicantStore() {
        return applicantStore;
    }

    public void setApplicantStore(Applicant applicantStore) {
        this.applicantStore.add(applicantStore);
    }
}
