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
public class CustomerAccount {
    
    private String acctID;
    private String acctName;
    private String contactName;

    public CustomerAccount(String acctID, String acctName, String contactName) {
        this.acctID = acctID;
        this.acctName = acctName;
        this.contactName = contactName;
    }

    public String getAcctID() {
        return acctID;
    }

    public void setAcctID(String acctID) {
        this.acctID = acctID;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    
}
