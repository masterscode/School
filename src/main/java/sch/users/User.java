package sch.users;


import sch.academics.Course;

import javax.naming.directory.InvalidAttributeValueException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @author Ogbinaka Emmanuel
 */

public class User {

    private static final ArrayList<User> users = new ArrayList<>();
    protected HashMap<String, String> address = new HashMap<String, String>();
    protected int gsm;
    protected HashMap<String, Integer> dateOfBirth = new HashMap<String, Integer>();
    protected HashMap<String, String> userType = new HashMap<String, String>();
    protected String firstName, lastName, gender, email;
    protected ArrayList<Course> courses = new ArrayList<Course>();
    private String USER_TYPE;

    public User(String firstName, String lastName, String gender, String email, int gsm, String USER_TYPE) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.gsm = gsm;
        this.USER_TYPE = USER_TYPE;
    }

    public static void addUser(User student) {
        users.add(student);
    }

    public void removeUser(User student) {
        users.remove(student);
    }

    protected int getAge() {
        try {
            if (!(this.dateOfBirth.get("year") == 0)) {
                Date date = new Date();
                LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                return localDate.getYear() - this.dateOfBirth.get("year");
            } else {
                throw new InvalidAttributeValueException("the date of birth field is unset");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    /*    private int getYear() {
            String[] thisYear = dateOfBirth.toString().split(" ");
            return Integer.parseInt(thisYear[thisYear.length - 1]);
        }
    */
    protected void setAddress(String city, String state, String country) {
        this.address.put("city", city);
        this.address.put("state", state);
        this.address.put("country", country);
    }

    protected void setUSerType(String key) {
        this.userType.put("principal", "Principal");
        this.userType.put("student", "Student");
        this.userType.put("teacher", "Teacher");
        this.userType.put("nonAcademic", "Non Academic");
        try {
            if (!this.userType.containsKey(key)) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.USER_TYPE = this.userType.get(key);
//        return this.userType.get(key);
    }

    public String getUserType() {
        return this.USER_TYPE;
    }

    protected void setDateOfBirth(int day, int month, int year) {
        this.dateOfBirth.put("day", day);
        this.dateOfBirth.put("month", month);
        this.dateOfBirth.put("year", year);
    }

    protected String getDateOfBirth(String key) {
        try {
            if (!dateOfBirth.containsKey(key)) {
                throw new IllegalArgumentException("That key does not exists");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dateOfBirth.get(key).toString();

    }

    public String getFullName() {
        try {
            if (this.firstName.equals("") || this.lastName.equals("")) {
                throw new NullPointerException();
            }
            return "";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return String.format("%s %s", this.firstName, this.lastName);
    }

}
