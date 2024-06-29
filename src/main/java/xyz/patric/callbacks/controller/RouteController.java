/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 5:54 PM
 *
 */

package xyz.patric.callbacks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.patric.callbacks.entity.Route;
import xyz.patric.callbacks.model.RouteMdl;
import xyz.patric.callbacks.service.RouteService;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable Long id) {
        return routeService.getRouteById(id);
    }

    @GetMapping("/{path}")
    public Route getRouteByPath(@PathVariable String path) {
        return routeService.getRouteByPath(path);
    }

    @PostMapping
    public Route createRoute(@RequestBody RouteMdl route) {
        return routeService.saveRoute(route);
    }
}