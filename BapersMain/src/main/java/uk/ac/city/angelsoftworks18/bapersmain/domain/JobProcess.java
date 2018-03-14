/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.domain;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author cris
 */
public class JobProcess {
    
    // Temp
    
    private String jobCode;
    
    private String notes;
    private String priority;
    private Date deadline;
    
    private Date startTime;
    private Date finishTime;
    private int timeTaken;
    
    private Status status;
    
    
    
    private Job job;

    public JobProcess(String jobCode, String notes, String priority, Date deadline) {
        this.jobCode = jobCode;
        this.notes = notes;
        this.priority = priority;
        this.deadline = deadline;
        
        //startTime = 
        //finishTime = 
    }
    
    
}
