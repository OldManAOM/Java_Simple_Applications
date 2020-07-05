/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

import java.util.Scanner;

/**
 *
 * @author Bradd
 */
public class Martin_Bradd_Assignment_10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double sale;
        
        int[] employees = new int[10];
        for (int counter = 0; counter < employees.length; counter++){
            System.out.printf("Enter the employee " + counter + "'s sales: ");
            employees[counter] = input.nextInt();
        }
        
        for (int counter =0; counter < employees.length; counter++){
            System.out.printf("Employee " + counter + "'s salary is: " + (500 + employees[counter] * 0.065) + "\n");
            }
        
        
        }           
}
        