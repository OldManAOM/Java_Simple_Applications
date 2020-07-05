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

public class Martin_Bradd_Final_Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String[] vin = {"","","","","","","","","","","","","","","","","","","","",""};
        String[] make = {"","","","","","","","","","","","","","","","","","","","",""};
        String[] model = {"","","","","","","","","","","","","","","","","","","","",""};
        int[] year = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double[] mileage = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        double[] price = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //21 elements
        
        double smallest = price[0];
        int exitNode = 1;
        int counter = 0;
        int choice = 0;
        double total = 0;
        int counting = 0;
        int i, sum, avg;
        sum = 0;
        
        
        while (choice != 7) {
        System.out.println("1. Enter new Vehicle\n");
        System.out.println("2. Edit a vehicle description\n");
        System.out.println("3. Display data for selected vehicle\n");
        System.out.println("4. Display all vehicles data\n");
        System.out.println("5. Display average mileage of each vehicle on the lot\n");
        System.out.println("6. Display the lowest price of all cars on the lot\n");
        choice = input.nextInt();
            switch (choice) {
                case 1:
                    exitNode = 1;
                    while (exitNode == 1) {
                        
                    System.out.println("What vehicle number will this be? : \n");
                    int vehNum = input.nextInt();

                    System.out.println("Please enter the vehicles vin number: \n");
                    String vinChoice = input.nextLine();
                    vin[vehNum] = (vinChoice);

                    System.out.println("Please enter the vehicles make: \n");
                    String makeChoice = input.nextLine();
                    make[vehNum] = (makeChoice);

                    System.out.println("Please enter the vehicles model: \n");
                    String modelChoice = input.nextLine();
                    model[vehNum] = (modelChoice);

                    System.out.println("Please enter the vehicles year: \n");
                    Integer yearChoice = input.nextInt();
                    year[vehNum] = (yearChoice);

                    System.out.println("Please enter the vehicles Mileage: \n");
                    Double mileageChoice = input.nextDouble();
                    mileage[vehNum] = (mileageChoice);

                    System.out.println("Please enter the vehicles price: \n");
                    Double priceChoice = input.nextDouble();
                    price[vehNum] = (priceChoice);               

                    System.out.println("Would you like to add another vehicle? 1 for yes, 2 for no. :\n");
                    exitNode = input.nextInt();
                    }
                    break;
                
                case 2:
                    System.out.println("Enter the vehicle number that you wish to edit: \n");
                    int vehicleChoiceEdit = input.nextInt();
                    System.out.println("What would you like to change? : \n");
                    System.out.println("1. Vin\n");
                    System.out.println("2. Make\n");
                    System.out.println("3. Model\n");
                    System.out.println("4. Year\n");
                    System.out.println("5. Mileage\n");
                    System.out.println("6. Price\n");
                    int choiceEdit = input.nextInt();
                    editVehicleStuff(vin, make, model, year, mileage, price, vehicleChoiceEdit, choiceEdit);
                    break;
                
                case 3:
                    System.out.println("Enter the number of the vehicle description you'd like to view: ");
                    int descVehChoice = input.nextInt();
                    System.out.printf("Information for Vehicle %s\n Vin: %s\n Make: %s\n Model: %s\n Year: %s\n Mileage: %s\n Price: $%.2f\n  ", descVehChoice, vin[descVehChoice], make[descVehChoice], model[descVehChoice], year[descVehChoice], mileage[descVehChoice], price[descVehChoice]  );
                    break;
                    
                case 4:
                    while (counting <= 20) {
                        System.out.printf("Information for Vehicle %s\n Vin: %s\n Make: %s\n Model: %s\n Year: %s\n Mileage: %s\n Price: $%.2f\n  ", counting, vin[counting], make[counting], model[counting], year[counting], mileage[counting], price[counting]  );
                        counting += 1;  
                    }
                    counting = 0;
                    break; 
                case 5:
                    for (i=0; i<mileage.length; i++) {
                        sum += mileage[i];                       
                    }
                    avg = sum / mileage.length;
                    System.out.println("The average of mileage of each vehicle on the lot is: " + avg + "\n");
                case 6:
                    for(int z = 0; z<=20; z++){
                        if (price[z] < smallest) smallest = price[z];
                    }
                    System.out.printf("The lowest price of all cars on the lot is: $%.2f\n", smallest);
                    break;
                case 7:
                    System.out.println("Which vehicle(number) is this concerning?");
                    int concernCar = input.nextInt();
                    
                    System.out.println("1. Did the customer like the vehicle?\n" +
                                       "2. Somewhat like the vehicle?\n" +
                                       "3. Not easily swayed?\n");
                    int discountDecide = input.nextInt();
                    
                    switch (discountDecide){
                        case 1:
                            price[concernCar] = -100;
                            System.out.println("Car discounted by $100.");
                        case 2:
                            price[concernCar] = -200;
                            System.out.println("Car discounted by $200.");
                        case 3:
                            price[concernCar] = -500;
                            System.out.println("Car discounted by $500.");
                    }
        }
        
            
    }
    }
        public static void editVehicleStuff(String v[],String ma[], String mod[], int ye[], double mile[], double pri[], int vehicleChoiceEdit, int choiceEdit){
                Scanner input = new Scanner(System.in);
                
        switch (choiceEdit) {
            case 1:
                System.out.println("Please enter the vehicles vin number: \n");
                String vinChoice = input.nextLine();
                v[vehicleChoiceEdit] = vinChoice;
                System.out.println("Vehicle description changed successfully!");
                break;
            case 2:
                System.out.println("Please enter the vehicles make: \n");
                String makeChoice = input.nextLine();
                ma[vehicleChoiceEdit] = makeChoice;
                System.out.println("Vehicle description changed successfully!");
                break;
            case 3:
                System.out.println("Please enter the vehicles model: \n");
                String modelChoice = input.nextLine();
                mod[vehicleChoiceEdit] = modelChoice;
                System.out.println("Vehicle description changed successfully!");
                break;
            case 4:
                System.out.println("Please enter the vehicles year: \n");
                Integer yearChoice = input.nextInt();
                ye[vehicleChoiceEdit] = yearChoice;
                System.out.println("Vehicle description changed successfully!");
                break;
            case 5:
                System.out.println("Please enter the vehicles Mileage: \n");
                Double mileageChoice = input.nextDouble();
                mile[vehicleChoiceEdit] = mileageChoice;
                System.out.println("Vehicle description changed successfully!");
                break;
            case 6:
                System.out.println("Please enter the vehicles price: \n");
                Double priceChoice = input.nextDouble();
                pri[vehicleChoiceEdit] = priceChoice;
                System.out.println("Vehicle description changed successfully!");
                break;
            default:
                System.out.println("No valid information was entered! \n");
                break;
        }
                    
                    

                    

                    

                    
            }
    }