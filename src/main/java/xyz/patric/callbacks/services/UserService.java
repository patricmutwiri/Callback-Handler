/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri on 6/29/24, 12:53 PM
 *
 */

package xyz.patric.callbacks.services;

import org.springframework.stereotype.Service;
import xyz.patric.callbacks.entity.User;

import java.util.List;

@Service
public class UserService {
    public void deleteUser(Long id) {
    }

    public User saveUser(User user) {
        return user;
    }

    public User getUserById(Long id) {
        return null;
    }

    public List<User> getAllUsers() {
        return List.of();
    }
}
