package fun;

import java.util.Date;

public interface IHumanBeing {
     String name = "";
     String gender = "";
     Date dateOfBirth = null;

     void eat(String foodName, String foodTemp);
     void sleep();
}
