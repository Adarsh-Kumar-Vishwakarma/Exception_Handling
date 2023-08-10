// Package named Adarsh
package Adarsh;

// Class representing a Tax Calculator
public class Tax_Calculator 
{

    // Method to calculate tax based on employee's name, salary, and citizenship
    public double calculateTax(String empName, double empSal, boolean Indian) throws Employee_Name_Invalid, Tax_Not_Eligible 
    {

        // Initialize tax amount to zero
        double taxAmount = 0.0;

        // Check if employee name is blank
        if (empName.isBlank()) 
        {
            // Throw exception if employee name is empty
            throw new Employee_Name_Invalid("The Employee Name cannot be Empty.");
        }

        // Calculate tax based on salary ranges
        if (empSal > 100000)
        {
            // Calculate tax at 8% for salary above 100000
            taxAmount = empSal * 8 / 100;
        } 
        else if (empSal >= 50000 && empSal <= 100000) 
        {
            // Calculate tax at 6% for salary between 50000 and 100000
            taxAmount = empSal * 6 / 100;
        } 
        else if (empSal >= 30000 && empSal < 50000) 
        {
            // Calculate tax at 5% for salary between 30000 and 50000
            taxAmount = empSal * 5 / 100;
        } 
        else if (empSal >= 10000 && empSal < 30000)
        {
            // Calculate tax at 4% for salary between 10000 and 30000
            taxAmount = empSal * 4 / 100;
        } 
        else 
        {
            // If salary is below 10000, employee doesn't need to pay tax
            throw new Tax_Not_Eligible("The Employee doesn't need to Pay Tax.");
        }

        // Return the calculated tax amount
        return taxAmount;
    }

    // Method to check if the input indicates Indian citizenship
    public boolean isIndian(String input) throws Country_Not_Valid 
    {
        // Check if input is 'y' (indicating Indian citizenship)
        if (input.equalsIgnoreCase("y")) 
        {
            return true;
        } 
        else 
        {
            // If input is not 'y', employee is not eligible for tax calculation
            throw new Country_Not_Valid("The Employee should be an Indian Citizen for Calculating Tax.");
        }
    }
}
