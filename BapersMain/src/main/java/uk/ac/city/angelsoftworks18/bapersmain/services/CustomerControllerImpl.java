/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import java.util.List;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import uk.ac.city.angelsoftworks18.bapersmain.domain.CustomerAccount;
import uk.ac.city.angelsoftworks18.bapersmain.domain.CustomerAccounts;

/**
 *
 * @author cris
 */

@Singleton
@DependsOn("CustomerAccounts")
public class CustomerControllerImpl implements CustomerController{

    @EJB
    CustomerAccounts accounts;
    
    @Override
    public List<CustomerAccount> findAllCustomers() {
        return accounts.getCustomers();
    }

    @Override
    public CustomerAccount findCustomerByID(String acctID) {
        for(CustomerAccount account : accounts.getCustomers()){
            if(account.getAcctID().compareToIgnoreCase(acctID) == 0){
                return account;
            }
        }
        return null;
    }

    @Override
    public CustomerAccount findCustomerByName(String acctName) {
        for(CustomerAccount account : accounts.getCustomers()){
            if(account.getAcctName().compareToIgnoreCase(acctName) == 0){
                return account;
            }
        }
        return null;
    }

    @Override
    public boolean createCustomerAccount(String acctID, String acctName, String contactName) {
        accounts.getCustomers().add(new CustomerAccount(acctID, acctName, contactName));
        return true;
    }
    
}
