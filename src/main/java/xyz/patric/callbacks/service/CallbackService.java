/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 8:13 PM
 *
 */

package xyz.patric.callbacks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.patric.callbacks.entity.Callback;
import xyz.patric.callbacks.entity.Route;
import xyz.patric.callbacks.model.CallbackMdl;
import xyz.patric.callbacks.repository.CallbackRepository;
import xyz.patric.callbacks.repository.RouteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CallbackService {
    private final RouteRepository routeRepository;
    private final CallbackRepository callbackRepository;

    @Autowired
    public CallbackService(CallbackRepository callbackRepository, RouteRepository routeRepository) {
        this.callbackRepository = callbackRepository;
        this.routeRepository = routeRepository;
    }

    public Callback getCallbackById(Long id) {
        return callbackRepository.findById(id).orElse(null);
    }

    public List<Callback> getCallbacksByPath(String path) {
        return new ArrayList<>(callbackRepository.findAllByRoute(routeRepository.findByPath(path)));
    }

    public Callback saveCallback(String path, CallbackMdl callback) {
        Route route = routeRepository.findByPath(path);
        Callback c = new Callback();
        c.setRoute(route);
        c.setType(c.getType());
        c.setPayload(c.getPayload());
        return callbackRepository.saveAndFlush(c);
    }
}