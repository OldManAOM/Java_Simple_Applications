/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

import java.util.Scanner;

/**
 *
 * @author tec435-student
 */
public class Martin_Bradd_Assignment_11 {
    public static void main(String[] args) {
        double[][] storeArrays = new double [3][2];
        int storeNum, departmentNum;
        double bonus;
        int counter = 0;
        double sum = 0;
        
        Scanner input = new Scanner(System.in);
        while (counter <= 1) {
            System.out.println("Enter the store number: \n");
            storeNum = input.nextInt();
        
            System.out.println("Enter the department number: \n");
            departmentNum = input.nextInt();
        
            System.out.println("Enter the bonus amount: \n");
            storeArrays[storeNum][departmentNum] = input.nextDouble();
            counter += 1;
        }
        counter = 0;
        for (int index = 0; index < storeArrays.length; index++){
            while (counter <= 2) {
                sum += storeArrays[index][counter];
                counter += 1;
            }
            
        }
        
        
        for (int index = 0; index < storeArrays.length; index++) {
            System.out.printf("Store " + index + " got a bonus of: " + storeArrays[1][0] + "\n");
            
        }
        
    }
        
        
        
    }
