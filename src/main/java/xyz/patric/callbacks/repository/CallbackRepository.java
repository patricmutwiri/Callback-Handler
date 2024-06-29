/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 1:22 PM
 *
 */

package xyz.patric.callbacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.patric.callbacks.entity.Callback;

import java.util.List;

public interface CallbackRepository extends JpaRepository<Callback, Long> {
    List<Callback> findAllByRoute(String route);
    List<Callback> findAllByType(String type);
}
