// Package named Adarsh
package Adarsh;

// Userdefined exception class for handling invalid employee name
public class Employee_Name_Invalid extends Exception 
{

    // Constructor to initialize the exception message
    public Employee_Name_Invalid(String message) 
    {
        // Call the constructor of the parent Exception class
        super(message);
    }

}
