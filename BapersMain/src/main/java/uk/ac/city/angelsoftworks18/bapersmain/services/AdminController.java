/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

/**
 *
 * @author cris
 */
public interface AdminController {
    
    boolean addNewTask();
    boolean removeTask();
    boolean updateTask();
    
    // ...
    boolean backupData();
    boolean restoreData();
}