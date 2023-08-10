// Package named Adarsh
package Adarsh;

// Custom exception class for handling invalid country
public class Country_Not_Valid extends Exception 
{

    // Constructor to initialize the exception message
    public Country_Not_Valid(String message) 
    {
        // Call the constructor of the parent Exception class
        super(message);
    }

}
