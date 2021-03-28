package sch.users.staffs;

import sch.interfaces.IUser;
import sch.users.User;

import java.util.List;

public class Principal extends User implements IUser {
    @Override
    public boolean create() {
        return false;
    }

    @Override
    public boolean update(int uid) {
        return false;
    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public boolean delete(int uid) {
        return false;
    }

    @Override
    public List<String> getUser(int uid) {
        return null;
    }
}
