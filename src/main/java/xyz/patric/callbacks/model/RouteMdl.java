/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 5:30 PM
 *
 */

package xyz.patric.callbacks.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RouteMdl {
    @NotEmpty
    private String path;
}
