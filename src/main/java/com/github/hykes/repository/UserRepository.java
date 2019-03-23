package com.github.hykes.repository;

import com.github.hykes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2019-03-23 13:36:00
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
