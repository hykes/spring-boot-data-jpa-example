package com.github.hykes.service;

import com.github.hykes.domain.User;

import java.util.List;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2019-03-23 13:36:00
 */
public interface UserService {

    Long create(User user);

    List<User> findAll();

}
