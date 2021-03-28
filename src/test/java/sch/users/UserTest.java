package sch.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp(){
        User users = new User();
    }

    @Test
    @DisplayName("This method will calculate the age of the user provided the dateOfBirth field is not null ")
    void getAge() {
        User users = new User();
        users.setDateOfBirth(12, 2, 1990 );
        int actual = users.getAge();
        int expected = 31;
        assertEquals(expected, actual);

    }

    @Test

    void setAddress() {
    }

    @Test
    @DisplayName("returns the object full name if the first name and last name is not null")
    void getFullName() {
        User user = new User();
        user.firstName = "emmanuel";
        user.lastName = "johm";
        String expected= "emmanuel johm";
        String actual = user.getFullName();
        assertEquals(expected, actual);

    }
}