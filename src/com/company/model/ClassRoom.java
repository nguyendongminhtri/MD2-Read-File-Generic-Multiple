package com.company.model;

import java.io.Serializable;

public class ClassRoom implements Serializable {
    private int id;
    private String name;

    public ClassRoom() {
    }

    public ClassRoom(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
