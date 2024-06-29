/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 7:03 PM
 *
 */

package xyz.patric.callbacks.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.patric.callbacks.entity.Route;
import xyz.patric.callbacks.model.RouteMdl;
import xyz.patric.callbacks.repository.RouteRepository;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class RouteService {
    public final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Long id) {
        return routeRepository.findById(id).orElse(null);
    }

    public Route saveRoute(RouteMdl route) {
        Route routeToSave = new Route();
        routeToSave.setPath(route.getPath());
        routeToSave.setCreatedAt(LocalDateTime.now());
        routeToSave.setUpdatedAt(LocalDateTime.now());
        try {
            return routeRepository.save(routeToSave);
        } catch (Exception e) {
            log.error("Error creating route {} ", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void deleteRouteById(Long id) {
        Route routeToDelete = getRouteById(id);
        log.warn("Delete route {} ", routeToDelete);
        routeRepository.delete(routeToDelete);
    }

    public Route getRouteByPath(String path) {
        return routeRepository.findByPath(path);
    }
}
