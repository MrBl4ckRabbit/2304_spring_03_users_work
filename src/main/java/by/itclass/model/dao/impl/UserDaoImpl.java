package by.itclass.model.impl;

import by.itclass.model.dao.UserDao;
import by.itclass.model.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAllUsers() {
        return List.of();
    }
}
