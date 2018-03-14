/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import java.util.ArrayList;
import java.util.List;
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
@DependsOn("UserAccounts")
public class UserControllerImpl implements UserController {
    
    @EJB
    UserAccounts users;

    // Stub
    @Override
    public UserAccount findUserByName(String username) {
        for(UserAccount user : users.getAccounts()){
            if(user.getUsername().compareTo(username) == 0){
                return user;
            }
        }
        return null;
    }

    // Stub
    @Override
    public UserAccount findUserByID(String acctID) {
        for(UserAccount user : users.getAccounts()){
            if(user.getAcctID().compareTo(acctID) == 0){
                return user;
            }
        }
        return null;
    }

    
    // Stub
    @Override
    public List<UserAccount> findAllUsers() {
        return users.getAccounts();
    }

    @Override
    public boolean createUser(String acctID, String username, String password, String role) {
        users.getAccounts().add(new UserAccount(acctID, username, password, role));
        return true;
    }

    @Override
    public boolean updateRole(String acctID, String newRole) {
        UserAccount user = findUserByID(acctID);
        if(user != null){
            user.setRole(newRole);
            return true;
        }
        return false;
    }
    
}
