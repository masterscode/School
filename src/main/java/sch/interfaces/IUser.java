package sch.interfaces;

import java.util.List;

public interface IUser {
    boolean create();
    boolean update(int uid);
    boolean delete(int uid);
    List<String> getUser(int uid);
    List<String> getAll();
}
