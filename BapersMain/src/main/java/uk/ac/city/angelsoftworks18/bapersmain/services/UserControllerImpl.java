/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import uk.ac.city.angelsoftworks18.bapersmain.domain.UserAccount;

/**
 *
 * @author cris
 */

@Singleton
public class UserControllerImpl implements UserController {

    // Stub
    @Override
    public UserAccount findUserByName(String username) {
        return new UserAccount("d145", username, "Password4", "Shift Manager");
    }

    
    // Stub
    @Override
    public List<UserAccount> findAllUsers() {
        ArrayList<UserAccount> users = new ArrayList<>();
        users.add(new UserAccount("a123", "Bob", "Password1", "Office Manager"));
        users.add(new UserAccount("b321", "Bill", "Password2", "Receptionist"));
        users.add(new UserAccount("c231", "Tech", "Password3", "Technician"));
        
        return users;
    }
    
}
