/*
* Author: Benjamin Gillmore
* Date: Oct 12, 2018
* Assignment: InvalidIntException
* Description: Defines the invalid int exception thrown when numbers are negative. (or 0 in this case)
*/
public class InvalidIntException extends Exception{
    private String message;
    
    //constructor
    public InvalidIntException() {
        this.message  = "Number cannot be negative.";
    }
    
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}