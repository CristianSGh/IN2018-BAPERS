/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import java.util.List;
import javax.ejb.Remote;
import uk.ac.city.angelsoftworks18.bapersmain.domain.Job;

/**
 *
 * @author cris
 */

@Remote
public interface ProcessController {
    
    Job findJobByID(String jobID);
    List<Job> findPendingJobs();
    List<Job> findCompletedJobs();
    List<Job> findAllJobs();
    
    // temp param
    boolean updateJobStatus(String[] newStatus);
    
}
