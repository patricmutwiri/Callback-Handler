/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri on 6/29/24, 12:46 PM
 *
 */

package xyz.patric.callbacks.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}