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
public class Martin_Bradd_Assignment_8 {
    public static void main(String[] args) {
        
        double total = 0;
        int end = 0;
        double MiniC = 3.96;
        double BubbleGum = 2.45;
        double PopcornBall = 1.07;
        double GummyMonster = 2.10;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Here is the table of products in inventory: \n"
                + "1. Mini-Candy Bars $3.96\n"
                + "Bubble Gum packs $2.45\n"
                + "Popcorn Balls $1.07\n"
                + "Gummy Monsters $2.10\n");
        System.out.printf("Please enter the item number of the candy that you would like to buy: ");
            int itemNum = input.nextInt();
        while (itemNum != 8) {            
            switch (itemNum) {
                case 1:
                    System.out.print("Mini-Candy Bars added\n");
                    total += MiniC;
                    System.out.print("Please Enter the next Product Number to add to this order:");
                    itemNum = input.nextInt();
                    break;
                case 2:
                    System.out.print("Bubble Gum packs added\n");
                    total += BubbleGum;
                    System.out.print("Please Enter the next Product Number to add to this order:");
                    itemNum = input.nextInt();
                    break;
                case 3:
                    System.out.print("Popcorn Balls added\n");
                    total += PopcornBall;
                    System.out.print("Please Enter the next Product Number to add to this order:");
                    itemNum = input.nextInt();
                    break;
                case 4:
                    System.out.print("Gummy Monsters added\n");
                    total += GummyMonster;
                    System.out.print("Please Enter the next Product Number to add to this order:");
                    itemNum = input.nextInt();
                    break;
                default:
                    System.out.print("Nothing was added...\n");
                    System.out.print("Note: Selections 5, 6, and 7 are not available at this time...\n");
                    System.out.print("Please Enter the next Product Number to add to this order: ");
                    itemNum = input.nextInt();
                    break;
                    
            }
            System.out.printf("Your total will be: $%.2f%n", total);
        }
    }
}
