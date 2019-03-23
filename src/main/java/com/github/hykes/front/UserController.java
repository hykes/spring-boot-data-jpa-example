package com.github.hykes.front;

import com.github.hykes.domain.User;
import com.github.hykes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2019-03-23 13:40:00
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Long create (@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> findAll () {
        return userService.findAll();
    }

}
