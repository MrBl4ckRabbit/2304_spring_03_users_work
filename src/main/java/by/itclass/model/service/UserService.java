package by.itclass.model.service;

import by.itclass.model.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void deleteById(int id);

    void addUser(User user);

    void update(User user);
}
