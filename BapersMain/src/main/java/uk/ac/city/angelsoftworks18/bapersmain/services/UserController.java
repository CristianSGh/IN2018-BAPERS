/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import java.util.List;
import javax.ejb.Remote;
import uk.ac.city.angelsoftworks18.bapersmain.domain.UserAccount;

/**
 *
 * @author cris
 */

@Remote
public interface UserController {
    
    UserAccount findUserByName(String username);
    UserAccount findUserByID(String acctID);
    List<UserAccount> findAllUsers();
    boolean createUser(String acctID, String username, String password, String role);
    boolean updateRole(String acctID, String newRole);
    
}
