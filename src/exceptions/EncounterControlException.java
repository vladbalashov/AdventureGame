/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author vladbalashov
 */
public class EncounterControlException extends Exception {

    public EncounterControlException() {
    }

    public EncounterControlException(String message) {
        super(message);
    }

    public EncounterControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public EncounterControlException(Throwable cause) {
        super(cause);
    }

    public EncounterControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
