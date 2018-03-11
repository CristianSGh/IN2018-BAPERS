/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.domain;

import java.util.ArrayList;

/**
 *
 * @author cris
 */
public class CustomerAccounts {
    
    private ArrayList<CustomerAccount> customers;

    public CustomerAccounts() {
        customers = new ArrayList<>();
        
        customers.add(new CustomerAccount("a1b1", "Account1", "Name1"));
        customers.add(new CustomerAccount("a2b2", "Account2", "Name2"));
    }

    public ArrayList<CustomerAccount> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<CustomerAccount> customers) {
        this.customers = customers;
    }
    
}
