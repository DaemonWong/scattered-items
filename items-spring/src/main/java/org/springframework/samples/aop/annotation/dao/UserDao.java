package org.springframework.samples.aop.annotation.dao;

import org.springframework.samples.aop.dto.User;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:11
 */
public interface UserDao {
    public void addUser(User user);

    User proceedUser(User user, String description);
}
