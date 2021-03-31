package sch.users.staffs;

import sch.interfaces.PrincipalInterface;
import sch.users.Student;
import sch.users.User;
import store.UserStore;

import java.util.List;

public class Principal implements PrincipalInterface {

    @Override
    public void expelStudent(User principal, User student) {
        if (principal.getUserType().equals("principal") && student.getUserType().equals("student")) {
            principal.removeUser(student);
        }
    }

    @Override
    public void admitStudent(User principal, User student) {
        if (principal.getUserType().equals("principal") && student.getUserType().equals("student")) {
            User.addUser(student);
        }
    }
}
