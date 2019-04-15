package controller;

/**
 * This class id for handling exception of entering an existing login.
 *
 * @author dulichka
 */
public class LoginException extends Exception {

    public LoginException(String message){
        super(message);
    }
}
