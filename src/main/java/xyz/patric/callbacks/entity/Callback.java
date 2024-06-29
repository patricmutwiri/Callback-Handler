/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 1:14 PM
 *
 */

package xyz.patric.callbacks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "callbacks")
public class Callback {
    @Id
    @GeneratedValue
    private Long id;

    private String route;
    private String type;
    private String payload;
}