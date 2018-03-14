/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.domain;

/**
 *
 * @author cris
 */
public class Task {
    
    private int id;
    private String description;
    private Location location;
    private String shelfSlot;
    private float price;
    private int duration;

    public Task(int id, String description, Location location, String shelfSlot, float price, int duration) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.shelfSlot = shelfSlot;
        this.price = price;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getShelfSlot() {
        return shelfSlot;
    }

    public void setShelfSlot(String shelfSlot) {
        this.shelfSlot = shelfSlot;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
