/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 2:47 PM
 *
 */

package xyz.patric.callbacks.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "routes")
public class Route {
    @Id
    @GeneratedValue
    private Long id;

    private String route;

    @OneToMany
    private List<Callback> callbacks = new ArrayList<>();


}