/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.domain;

/**
 *
 * @author cris
 */

public class UserAccount {
    
    private String acctID;
    private String username;
    private String password;
    private String role;
    
    private boolean loggedIn;

    public UserAccount(String acctID, String username, String password, String role) {
        this.acctID = acctID;
        this.username = username;
        this.password = password;
        this.role = role;
        
        loggedIn = false;
    }

    public String getAcctID() {
        return acctID;
    }

    public void setAcctID(String acctID) {
        this.acctID = acctID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    public boolean isLoggedIn(){
        return loggedIn;
    }
    
    public void setLoggedIn(boolean p){
        loggedIn = p;
    }
}
