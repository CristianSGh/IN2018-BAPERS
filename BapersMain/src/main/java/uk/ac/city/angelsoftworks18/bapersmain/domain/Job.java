/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cris
 */
public class Job {
    
    private String id;
    private ArrayList<Task> tasks;
    
    private float totalPrice;
    private int timeUntilCompletion;

    public Job(String id, ArrayList<Task> tasks) {
        this.id = id;
        this.tasks = tasks;
        
        totalPrice = 0;
        for(Task task : tasks){
            totalPrice += task.getPrice();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
