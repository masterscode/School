package sch.users;

import sch.interfaces.IUser;

import java.util.List;

public class Student extends User implements IUser {
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

    public boolean assignClass(int classUid){
        return false;
    }

}
