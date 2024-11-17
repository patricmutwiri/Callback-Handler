/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 11/17/24, 1:08 PM
 *
 */

package xyz.patric.callbacks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "users")
public class User extends Auditable{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}