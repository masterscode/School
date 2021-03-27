package fun;

import java.util.Date;

public abstract  class HumanBeing {
    protected String name;
    protected String gender;
    protected Date dateOfBirth;

    abstract void eat();
    abstract void sleep();
}
