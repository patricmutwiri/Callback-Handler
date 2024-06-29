/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 1:14 PM
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