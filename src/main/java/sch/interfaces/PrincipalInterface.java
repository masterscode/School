package sch.interfaces;

import sch.users.User;

public interface PrincipalInterface {
    void expelStudent(User principal, User student);
    void admitStudent(User principal, User student);
}
