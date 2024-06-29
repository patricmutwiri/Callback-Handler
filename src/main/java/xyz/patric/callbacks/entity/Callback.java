/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 5:54 PM
 *
 */

package xyz.patric.callbacks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "callbacks")
public class Callback extends Auditable{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Route route;

    private String type;
    private String payload;
}