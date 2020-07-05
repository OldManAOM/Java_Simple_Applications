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
public class Martin_Bradd_Assignment_13 {
    public static void main(String[] args){
        //making Time bad Guy
       TimeExpiredTicket timedGuy = new TimeExpiredTicket("COVFEFE", "Tesla", "CyberTruck","Silver", 50);
       
       System.out.println("Time expired civilian detected! ");
       System.out.printf("%s %s%n", "Tag is: ", timedGuy.getTag());
       System.out.printf("%s %s%n", "Make is: ", timedGuy.getMake());
       System.out.printf("%s %s%n", "Model is: ", timedGuy.getModel());
       System.out.printf("%s %s%n", "Color is: ", timedGuy.getColor());
       System.out.printf("%s $%.2f%n", "Parking charge is: ", timedGuy.getTimeCharge());
       
       HandicappedTicket handiCrook = new HandicappedTicket("8HHP413", "Tesla", "Model X","White", 100);
       
       System.out.printf("%n%s %n","Enabled driver detected! ");
       System.out.printf("%s %s%n", "Tag is: ", handiCrook.getTag());
       System.out.printf("%s %s%n", "Make is: ", handiCrook.getMake());
       System.out.printf("%s %s%n", "Model is: ", handiCrook.getModel());
       System.out.printf("%s %s%n", "Color is: ", handiCrook.getColor());
       System.out.printf("%s $%.2f%n", "Parking charge is: ", handiCrook.getHandiCharge());
    
       FireLaneTicket fireViolation = new FireLaneTicket("ISAD", "Porsche", "Taycan Turbo S","Green", 150);
       
       System.out.printf("%n%s%n","Fire Hazard detected! ");
       System.out.printf("%s %s%n", "Tag is: ", fireViolation.getTag());
       System.out.printf("%s %s%n", "Make is: ", fireViolation.getMake());
       System.out.printf("%s %s%n", "Model is: ", fireViolation.getModel());
       System.out.printf("%s %s%n", "Color is: ", fireViolation.getColor());
       System.out.printf("%s $%.2f%n", "Parking charge is: ", fireViolation.getFireCharge());
    
    
    }   
}
