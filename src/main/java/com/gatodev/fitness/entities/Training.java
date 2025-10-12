package com.gatodev.fitness.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;

@Entity
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int duration;
    private int maxParticipants;

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public int getDuration() {
        return this.duration;
    }

    @Generated
    public int getMaxParticipants() {
        return this.maxParticipants;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setName(final String name) {
        this.name = name;
    }

    @Generated
    public void setDescription(final String description) {
        this.description = description;
    }

    @Generated
    public void setDuration(final int duration) {
        this.duration = duration;
    }

    @Generated
    public void setMaxParticipants(final int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Generated
    public Training(final Long id, final String name, final String description, final int duration, final int maxParticipants) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.maxParticipants = maxParticipants;
    }

    @Generated
    public Training() {
    }
}
