/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import javax.ejb.Remote;

/**
 *
 * @author cris
 */

@Remote
public interface AuthenticationController {
    
    boolean login(String username, String password);
    
}
