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
    public boolean login(String username, String password) {
        UserAccount user = controller.findUserByName(username);
        if(user.getPassword().compareTo(password) == 0){
            user.setLoggedIn(true);
            return user.isLoggedIn();
        }
        return false;
    }
    
    // Stub
    @Override
    public boolean logout(String acctID) {
        UserAccount user = controller.findUserByID(acctID);
        user.setLoggedIn(false);
        return user.isLoggedIn();
    }
    
}
