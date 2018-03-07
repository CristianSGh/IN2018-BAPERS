/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import javax.ejb.Singleton;
import uk.ac.city.angelsoftworks18.bapersmain.domain.UserAccount;

/**
 *
 * @author cris
 */

@Singleton
public class AuthenticationControllerImpl implements AuthenticationController {

    // Stub
    @Override
    public boolean login(String username, String password) {
        UserAccount user = new UserAccount("a123", "User1", "password1", "Office Manager");
        
        return (username.compareTo(user.getUsername()) == 0) && (password.compareTo(user.getPassword()) == 0);
    }
    
}
