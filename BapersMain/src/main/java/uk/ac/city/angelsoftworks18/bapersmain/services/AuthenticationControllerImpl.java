/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import uk.ac.city.angelsoftworks18.bapersmain.domain.UserAccount;
import uk.ac.city.angelsoftworks18.bapersmain.domain.UserAccounts;

/**
 *
 * @author cris
 */

@Singleton
@DependsOn("UserControllerImpl")
public class AuthenticationControllerImpl implements AuthenticationController {

    @EJB
    UserController controller;
    
    
    
    // Stub
    @Override
    public String login(String username, String password) {
        UserAccount user = controller.findUserByName(username);
        if(user.getPassword().compareTo(password) == 0){
            user.setLoggedIn(true);
            return user.getAcctID();
        }
        return null;
    }

    
    
    // Stub
    @Override
    public boolean logout(String sessionToken) {
        UserAccount user = controller.findUserByID(sessionToken);
        user.setLoggedIn(false);
        if(user.isLoggedIn() == false){
            return true;
        }
        return false;
    }
    
}
