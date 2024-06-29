/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 8:13 PM
 *
 */

package xyz.patric.callbacks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.patric.callbacks.entity.Callback;
import xyz.patric.callbacks.model.CallbackMdl;
import xyz.patric.callbacks.service.CallbackService;

import java.util.List;

@RestController
@RequestMapping("/api/callbacks")
public class CallbackController {
    private final CallbackService callbackService;

    @Autowired
    public CallbackController(CallbackService callbackService) {
        this.callbackService = callbackService;
    }

    @GetMapping("/{id}")
    public Callback getCallbackById(@PathVariable Long id) {
        return callbackService.getCallbackById(id);
    }

    @GetMapping("/{path}")
    public List<Callback> getCallbacksByPath(@PathVariable String path) {
        return callbackService.getCallbacksByPath(path);
    }

    @PostMapping("/{path}")
    public Callback createCallback(@PathVariable String path, @RequestBody CallbackMdl callback) {
        return callbackService.saveCallback(path, callback);
    }
}