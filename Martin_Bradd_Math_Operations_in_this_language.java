package JavaProgramming;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradd
 */
public class Martin_Bradd_Math_Operations_in_this_language {
    
    public static void main(String[] args){
        //instance a Scanner 
        Scanner keyboard = new Scanner(System.in);
        //get inputs from user
    System.out.print("Please enter the first integer: ");
    int number1 = keyboard.nextInt();
    System.out.print("Please enter the second integer: ");
    int number2 = keyboard.nextInt();
    
    //calculations
    int Add = number1 + number2;
    int Sub = number1 - number2;
    int Mult = number1 * number2;
    int Divide = number1 / number2;
    
    System.out.println("By addition your answer will be: " + Add);
    System.out.println("By Subtraction your answer will be: " + Sub);
    System.out.println("By Multiplication your answer will be: " + Mult);
    System.out.println("By division your answer will be: " + Divide);
    
    
    }
}
