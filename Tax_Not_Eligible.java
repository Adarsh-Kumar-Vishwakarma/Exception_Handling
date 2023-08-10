// Package named Adarsh
package Adarsh;

// Userdefined exception class for handling cases where tax is not eligible
public class Tax_Not_Eligible extends Exception 
{

    // Constructor to initialize the exception message
    public Tax_Not_Eligible(String message) 
    {
        // Call the constructor of the parent Exception class
        super(message);
    }

}
