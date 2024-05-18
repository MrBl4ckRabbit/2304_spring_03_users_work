package by.itclass.model.service.impl;

import by.itclass.model.dao.UserDao;
import by.itclass.model.entities.User;
import by.itclass.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getAllUsers() {
        return dao.selectAllUsers();
    }

    @Override
    public void deleteById(int id) {
        dao.removeById(id);
    }

    @Override
    public void addUser(User user) {
        dao.insertUser(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }


}
