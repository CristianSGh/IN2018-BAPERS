/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.domain;

import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author cris
 */


@Singleton
public class UserAccounts {
    
   private ArrayList<UserAccount> accounts;
    
    

    public UserAccounts() {
        accounts = new ArrayList<>();
        accounts.add(new UserAccount("a123", "Bob", "Password1", "Office Manager"));
        accounts.add(new UserAccount("b321", "Bill", "Password2", "Receptionist"));
    }

    public ArrayList<UserAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<UserAccount> accounts) {
        this.accounts = accounts;
    }

    
    
    
    
}
