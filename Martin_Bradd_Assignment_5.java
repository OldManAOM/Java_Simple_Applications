/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

/**
 * Martin_Bradd_Assignment5.java
 * 
 * This program will allow people to buy things at a store.
 * 
 * @author B. Martin
 */
import java.util.Scanner;

public class Martin_Bradd_Assignment_5 {
    public static void main(String[] args) {
        
        int counter = 1;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Here is a list of item choices: \n"
                + "Item 1: Stove(209.00)\n"
                + "Item 2: Microwave(129.50)\n"
                + "item 3: Waffle Maker(118.00)\n"
                + "Item 4: Refrigerator(239.00)\n");
        while (4 >= counter) {
            System.out.printf("Please enter the item number that you would like to buy: ");
            int itemNum = input.nextInt();
            
            if (itemNum == 1 ) {
                System.out.print("Please enter the quantity of this item: ");
                int Item1Quantity = input.nextInt();
                double item1Cost = Item1Quantity * 209.00;
                total += item1Cost;
                counter += 1;
                
            }
            else if (itemNum == 2) {
                System.out.print("Please enter the quantity of this item: ");
                int Item2Quantity = input.nextInt();
                double item2Cost = Item2Quantity * 129.50;
                total += item2Cost;
                counter += 1;
            }
            else if (itemNum == 3) {
                System.out.print("Please enter the quantity of this item: ");
                int Item3Quantity = input.nextInt();
                double item3Cost = Item3Quantity * 118.00;
                total += item3Cost;
                counter += 1;
            }
            else if (itemNum == 4) {
                System.out.print("Please enter the quantity of this item: ");
                int Item4Quantity = input.nextInt();
                double item4Cost = Item4Quantity * 232.00;
                total += item4Cost;
                counter += 1;
            }
            else {
                System.out.print("That isn't a valid item!");
            }
        }
        
        System.out.printf("Your total is: $%.2f%n", total);
              
    }
}
