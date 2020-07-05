package JavaProgramming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B. Martin
 */
// This program will allow a user to choose a quantity 
//and price in order to get a total of something.


import java.util.Scanner;

public class Martin_Bradd_Variable_declaration_and_simple_input_and_output {
  
    public static void main(String[] args){
        //instance a Scanner 
        Scanner keyboard = new Scanner(System.in);
//ask user for name, price and quantity
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        //ask user for miles and gallons
        System.out.print("Enter your quantity: ");
        int quantity = keyboard.nextInt();
        System.out.print("Enter your price: $");
        float price = keyboard.nextFloat();
        
        //calculate total
        float total = quantity * price;
        
        //display
        System.out.println("Hi " + name + " your total will be: $" + total);
        System.out.println("Have a nice day!");
        
        
        
        
        
        }
    
    
    
    
    
    
    
    
    
}

 