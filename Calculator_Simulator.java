// Package named Adarsh
package Adarsh;

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class representing a Calculator Simulator
public class Calculator_Simulator 
{

    // Main method where program execution starts
    public static void main(String[] args) 
    {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create an instance of Tax_Calculator class
        Tax_Calculator obj = new Tax_Calculator();

        try 
        {
            // Prompt user to input Indian citizenship status
            System.out.println("You are an Indian Citizen or Not(Y/N) ");
            String input = sc.nextLine();
            System.out.println();

            // Prompt user to input full name
            System.out.println("Enter Your Full Name ");
            String empName = sc.nextLine();
            System.out.println();

            // Prompt user to input current salary
            System.out.println("Enter Your Current Salary ");
            double empSal = sc.nextDouble();
            System.out.println();

            // Calculate and display tax amount using Tax_Calculator methods
            System.out.println("Calculated Tax Amount is " + obj.calculateTax(empName, empSal, obj.isIndian(input)) + " /-");
        } 
        catch (Country_Not_Valid e) 
        {
            // Catch block for handling Country_Not_Valid exception
            System.out.println("Country not valid!!!!");
            System.out.println(e.getMessage());
        }
        catch (Employee_Name_Invalid e) 
        {
            // Catch block for handling Employee_Name_Invalid exception
            System.out.println("Employee name not valid!!!!");
            System.out.println(e.getMessage());
        } 
        catch (Tax_Not_Eligible e) 
        {
            // Catch block for handling Tax_Not_Eligible exception
            System.out.println("Not eligible for Tax calculation!!!!");
            System.out.println(e.getMessage());
        }
    }
}
