/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri on 6/29/24, 12:50 PM
 *
 */

package xyz.patric.callbacks.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserMdl {
    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;
}