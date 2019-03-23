package com.github.hykes.service;

import com.github.hykes.domain.User;
import com.github.hykes.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2019-03-23 13:37:00
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @PersistenceContext
    private final EntityManager entityManager;

    public UserServiceImpl(UserRepository userRepository,
                           EntityManager entityManager) {
        this.userRepository = userRepository;
        this.entityManager = entityManager;
    }

    @Override
    public Long create(User user) {
        user = userRepository.save(user);
        return user.getId();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
