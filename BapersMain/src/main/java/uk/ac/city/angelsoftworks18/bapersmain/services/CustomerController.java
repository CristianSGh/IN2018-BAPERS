/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.angelsoftworks18.bapersmain.services;

import java.util.List;
import javax.ejb.Remote;
import uk.ac.city.angelsoftworks18.bapersmain.domain.CustomerAccount;

/**
 *
 * @author cris
 */

@Remote
public interface CustomerController {
    
    List<CustomerAccount> findAllCustomers();
    CustomerAccount findCustomerByID(String acctID);
    CustomerAccount findCustomerByName(String acctName);
    boolean createCustomerAccount(String acctID, String acctName, String contactName);
}
