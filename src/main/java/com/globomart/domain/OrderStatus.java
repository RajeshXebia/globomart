package com.globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class OrderStatus {

    private long id;
    private String name;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}