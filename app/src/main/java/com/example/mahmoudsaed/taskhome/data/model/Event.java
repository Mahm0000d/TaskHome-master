package com.example.mahmoudsaed.taskhome.data.model;


import java.io.ByteArrayOutputStream;

import java.util.List;

/**
 * Created by Mahmoud Saed on 2/19/2020.
 */
public class Event {
    private int id;
    private String name;
    private List<String> photos;

    public Event(int id, String name, List<String> photos) {
        this.id = id;
        this.name = name;
        this.photos = photos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotos() {

        return this.photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
