package sch.users;


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
    protected String firstName,
            lastName, gender, email;
    protected HashMap<String, String> address = new HashMap<String, String>();
    protected int gsm;
    protected HashMap<String, Integer> dateOfBirth = new HashMap<String, Integer>();
    protected  HashMap<String, String> userType = new HashMap<String, String>();

    /**
     * userStore will act as a conceptual store
     */
    protected HashMap<String, ArrayList<User>> userStore = new HashMap<String, ArrayList<User>>();

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
    protected String getUSerType(String key){
        this.userType.put("principal", "Principal");
        this.userType.put("student", "Student");
        this.userType.put("teacher", "Teacher");
        this.userType.put("nonAcademic", "Non Academic");
        try {
            if(!this.userType.containsKey(key)){
                throw new NullPointerException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return this.userType.get(key);
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
            if (this.firstName.equals("") ||  this.lastName.equals("")) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return String.format("%s %s", this.firstName, this.lastName);
    }


}
