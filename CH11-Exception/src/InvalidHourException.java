/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class InvalidHourException extends Exception{
    private String message;
    
    //constructor
    public InvalidHourException() {
        this.message  = "Hours must be between 0 and 12";
    }
    
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
