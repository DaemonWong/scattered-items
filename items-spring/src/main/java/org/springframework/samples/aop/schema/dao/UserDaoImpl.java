package org.springframework.samples.aop.schema.dao;

import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.utils.UserFactory;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:12
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void delAllUsers() {
        System.out.println(this.getClass().getSimpleName() + "delete all users");
    }

    @Override
    public int countUser() {
        System.out.println(this.getClass().getSimpleName() + "count user's number...");
        return 0;
    }

    @Override
    public User getUser(int userId) {
        return UserFactory.createDefaultUser();
    }

    @Override
    public void addUser(User user) {
        System.out.println(this.getClass().getSimpleName() + " add user : " + user.toString());
    }
}
