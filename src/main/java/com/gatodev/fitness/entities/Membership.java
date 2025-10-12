package com.gatodev.fitness.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;

@Entity
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int duration;
    private String category;
    private int sessionPersonalized;
    private int sessionGroup;
    private double price;

    @Generated
    public Long getId() {
        return id;
    }

    @Generated
    public int getDuration() {
        return duration;
    }

    @Generated
    public String getCategory() {
        return category;
    }

    @Generated
    public int getSessionPersonalized() {
        return sessionPersonalized;
    }

    @Generated
    public int getSessionGroup() {
        return sessionGroup;
    }

    @Generated
    public double getPrice() {
        return price;
    }

    @Generated
    public void setId(Long id) {
        this.id = id;
    }

    @Generated
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Generated
    public void setCategory(String category) {
        this.category = category;
    }

    @Generated
    public void setSessionPersonalized(int sessionPersonalized) {
        this.sessionPersonalized = sessionPersonalized;
    }

    @Generated
    public void setSessionGroup(int sessionGroup) {
        this.sessionGroup = sessionGroup;
    }

    @Generated
    public void setPrice(double price) {
        this.price = price;
    }

    @Generated
    public Membership(Long id, int duration, String category,
                      int sessionPersonalized, int sessionGroup, double price) {
        this.id = id;
        this.duration = duration;
        this.category = category;
        this.sessionPersonalized = sessionPersonalized;
        this.sessionGroup = sessionGroup;
        this.price = price;
    }

    @Generated
    public Membership() {}
}
