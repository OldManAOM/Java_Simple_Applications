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
public class Martin_Bradd_Assignment_7 {

    public static void main(String[] args) {
        System.out.println("Pattern 1\n");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("&");
            }
            System.out.println("\n");
        }
        
        System.out.println("Pattern 2\n");
        for (int row = 1; row <= 5; row++) {
            //paddings for each row
            /*for (int paddings = 0; paddings < row - 1; paddings ++){
                System.out.print(" ");
            }*/
            //character on each row
            for (int col = 1; col <= 5 - row + 1; col++) {
                System.out.print("&");
            }
            System.out.println("\n");
        }
        
        

    }
  }
