package uk.ac.city.angelsoftworks18.bapersmain;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import uk.ac.city.angelsoftworks18.bapersmain.services.AuthenticationController;
import uk.ac.city.angelsoftworks18.bapersmain.services.UserController;

/**
 * Class containing the "main" method
 * prints Hello world! by default - replace with your code
 *
 */

public class Main {
    
    public static void main( String[] args ) {
        // ...
        
        
        
        try{
            Context jndi = new InitialContext();
            AuthenticationController auth = (AuthenticationController) jndi.lookup("java:global/Bapers/AuthenticationControllerImpl");
            //UserController contr = (UserController) jndi.lookup("java:global/Bapers/UserControllerImpl");
            
            String sessionToken = auth.login("Bob", "Password1");
            if(sessionToken != null){
                System.out.println("Logged in.");
            } else {
                System.out.println("Login failed.");
            }
            
        } catch (NamingException ex) {
            System.out.println(ex);
        }
    }
    
}
