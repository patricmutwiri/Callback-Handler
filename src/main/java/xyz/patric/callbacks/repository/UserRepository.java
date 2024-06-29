/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri on 6/29/24, 12:50 PM
 *
 */

package xyz.patric.callbacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.patric.callbacks.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}