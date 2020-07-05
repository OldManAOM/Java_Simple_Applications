/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

/**
 *
 * @author tec435-student
 */

import java.util.Scanner;
public class Martin_Bradd_Assignment_3 {
   public static void main(String[] args) {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
     
      //This is where the withdrawing begins
      System.out.print("Enter withdraw Amount for account1: "); //prompt
      double withdrawAmount = input.nextDouble(); //obtain withdraw input
      if (withdrawAmount > account1.getBalance()) {
          System.out.print("Withdrawal amount exceeded account balance.");
      } else {
      System.out.printf("%nsubtracting %.2f from account 1 balance%n%n", withdrawAmount);
      account1.withDraw(withdrawAmount); // subtract from account1's balance
      
      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
      
      System.out.print("Enter withdraw Amount for account2: "); //prompt
      withdrawAmount = input.nextDouble(); //obtain withdraw input
      if (withdrawAmount > account2.getBalance()) {
          System.out.print("Withdrawal amount exceeded account balance.");
      } else {
      System.out.printf("%nsubtracting %.2f from account 2 balance%n%n", withdrawAmount);
      account2.withDraw(withdrawAmount); // subtract from account2's balance
      
      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());
   }
      
   }
   }
}