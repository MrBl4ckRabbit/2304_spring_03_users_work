package by.itclass.model.dao;

import by.itclass.model.entities.User;

import java.util.List;

public interface UserDao {
    List<User> selectAllUsers();

    void removeById(int id);

    void insertUser(User user);

    void update(User user);

}
