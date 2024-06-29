/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 7:50 PM
 *
 */

package xyz.patric.callbacks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.patric.callbacks.entity.Route;
import xyz.patric.callbacks.model.RouteMdl;
import xyz.patric.callbacks.repository.RouteRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RouteService {
    public RouteRepository routeRepository;

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
            throw new RuntimeException(e);
        }
    }

    public void deleteRouteById(Long id) {
        Route routeToDelete = getRouteById(id);
        routeRepository.delete(routeToDelete);
    }

    public Route getRouteByPath(String path) {
        return routeRepository.findByPath(path);
    }
}
