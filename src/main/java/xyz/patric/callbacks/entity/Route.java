/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 2:47 PM
 *
 */

package xyz.patric.callbacks.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
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