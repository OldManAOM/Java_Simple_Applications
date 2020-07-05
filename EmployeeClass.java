/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

/**
 *
 * @author Bradd
 */
import java.util.Scanner;

public class EmployeeClass {
    public static void main(String[] args) {
      EmployeeClassHelper Person1 = new EmployeeClassHelper("Taco", "Man", 0);
      EmployeeClassHelper Person2 = new EmployeeClassHelper("Chicago", "Cow", 0); 
      
      System.out.printf("Welcome: %s %s%n", Person1.getfName(), Person1.getlName() );
      
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter sales bonus: $"); // prompt
      double salesBonus = input.nextDouble(); // obtain user input
      System.out.print("Enter monthly Salary: $"); // prompt
      double monthlySalary = input.nextDouble(); // obtain user input  
      Person1.setYearlySalary(monthlySalary, salesBonus);
      
      
      System.out.printf("%s %s's Yearly Salary is: $%.2f%n",
         Person1.getfName(),Person1.getlName(), Person1.getYearlySalary()); 
      System.out.printf("%s %s's Monthly Salary: $%.2f%n", 
              Person1.getfName(),Person1.getlName(), Person1.setMonthlySalary(monthlySalary));
      System.out.printf("%s %s's Sales Bonus: $%.2f%n", 
              Person1.getfName(),Person1.getlName(), Person1.setSalesBonus(salesBonus));
      
      
      System.out.printf("Welcome: %s %s\n", Person2.getfName(), Person2.getlName());
      
      System.out.print("Enter sales bonus: $"); // prompt
      salesBonus = input.nextDouble(); // obtain user input
      System.out.print("Enter monthly Salary: $"); // prompt
      monthlySalary = input.nextDouble(); // obtain user input  
      Person2.setYearlySalary(monthlySalary, salesBonus);
      
      
      System.out.printf("%s %s's Yearly Salary is: $%.2f%n",
         Person2.getfName(),Person2.getlName(), Person2.getYearlySalary()); 
      System.out.printf("%s %s's Monthly Salary: $%.2f%n", 
              Person2.getfName(),Person2.getlName(), Person2.setMonthlySalary(monthlySalary));
      System.out.printf("%s %s's Sales Bonus: $%.2f%n", 
              Person2.getfName(),Person2.getlName(), Person2.setSalesBonus(salesBonus));
      
    }
}
