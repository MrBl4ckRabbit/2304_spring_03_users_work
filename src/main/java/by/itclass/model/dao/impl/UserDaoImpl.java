package by.itclass.model.dao.impl;

import by.itclass.model.dao.UserDao;
import by.itclass.model.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> selectAllUsers() {

        try (var session = sessionFactory.openSession()) {
            return session.createQuery("from User", User.class).list();
        }
    }

    @Override
    public void removeById(int id) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            var user = session.get(User.class, id);
            session.delete(user);
            transaction.commit();
        }
    }

    @Override
    public void insertUser(User user) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }
    }

    @Override
    public void update(User user) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        }
    }
}
