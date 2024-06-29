/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 5:54 PM
 *
 */

package xyz.patric.callbacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.patric.callbacks.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {
    Route findByPath(String p);
    Route findById(long id);
}
