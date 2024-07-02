/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 8:13 PM
 *
 */

package xyz.patric.callbacks.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.patric.callbacks.entity.Callback;
import xyz.patric.callbacks.model.CallbackMdl;
import xyz.patric.callbacks.service.CallbackService;

import java.util.List;

@Slf4j
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
    public Callback createCallback(HttpServletRequest httpServletRequest, @PathVariable String path, @RequestBody CallbackMdl callback) {
        httpServletRequest.getHeaderNames().asIterator().forEachRemaining(name -> log.info(">> {} {} ", name, httpServletRequest.getHeader(name)));
        return callbackService.saveCallback(path, callback);
    }
}