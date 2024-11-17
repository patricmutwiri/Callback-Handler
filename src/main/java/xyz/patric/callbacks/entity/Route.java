/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 11/17/24, 1:08 PM
 *
 */

package xyz.patric.callbacks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "routes")
public class Route extends Auditable{
    @Id
    @GeneratedValue
    private Long id;

    private String path;

    @OneToMany
    private List<Callback> callbacks = new ArrayList<>();
}