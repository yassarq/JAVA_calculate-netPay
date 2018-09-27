// # Name:       Yassar Qureshi
// # Class:      CIS-2751
// # Assignment: Homework 4 (4.23) Employee info
// # File:       Unit4_YassarQureshi.java
// # Purpose:    calculate employee's income and tax with held
import java.util.Scanner;

public class Unit4_YassarQureshi {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee's name: ");
        String name = input.nextLine();

        // Prompt the user to enter the hours worked
        System.out.println("Enter the numbers of hours worked in a week: ");
        double hours = input.nextDouble();
        // Prompt the user to enter the rate
        System.out.println("Enter the hourly pay rate: ");
        double rate = input.nextDouble();
        // Prompt the user to enter the federal tax with holding rate
        System.out.println("Enter the federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        // Prompt the user to enter the state tax with holding rate
        System.out.println("Enter state tax withholding rate:");
        double staTax = input.nextDouble();
        // Print name
        System.out.println("Employee's Name: " + name);
        // Print hours worked
        System.out.println("Hours Work: " + hours);
        // Print rate
        System.out.println("Pay Rate: " + rate);
        // Print gross pay
        System.out.println("Gross Pay: " + rate * hours);
        // print all deductions (federal, state and total)
        System.out.println("Deduction: ");
        System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", fedTax * 100, fedTax * rate * hours);
        System.out.printf("State Withholding (%.1f%%): $%.2f\n", staTax * 100, fedTax * rate * hours);
        System.out.printf("Total Deduction: $%2.f\n", (staTax + fedTax) * rate * hours);
        // print income after deduction 
        System.out.printf("Net Pay: $%2.f\n", (1 - staTax - fedTax) * rate * hours);
    }
}