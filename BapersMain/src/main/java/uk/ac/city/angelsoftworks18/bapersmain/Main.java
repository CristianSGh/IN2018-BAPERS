package uk.ac.city.angelsoftworks18.bapersmain;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import uk.ac.city.angelsoftworks18.bapersmain.services.AuthenticationController;

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
            if(auth.login("User1", "password1")){
                System.out.println("Logged in.");
            } else {
                System.out.println("Login failed");
            }
        } catch (NamingException ex) {
            System.out.println(ex);
        }
    }
    
}
