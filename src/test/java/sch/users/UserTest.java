package sch.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user;
    @BeforeEach
     void init() {
       this.user = new User();
    }

    @Test
    @DisplayName("This method will calculate the age of the user provided the dateOfBirth field is not null ")
    void getAge() {
        user.setDateOfBirth(2,4, 1990);
        int actual = user.getAge();
        int expected = 31;
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Test for address field setter method")
    void setAddress() {
        user.setAddress("ajah", "lagos", "nigeria");
        String actual = user.address.get("state");
        String expected = "lagos";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("returns the object full name if the first name or last name is not null")
    void getFullName() {
        user.firstName = "emmanuel";
        user.lastName = "john";
        String expected = "emmanuel john";
        String actual = user.getFullName();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("test for user type assignment operation")
    void setUserType() {
        user.setUSerType("student");
        String actual = user.getUserType();
        String expected = "Student";

        assertEquals(expected, actual);
    }
}
