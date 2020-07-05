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
public class EmployeeClassHelper {
    private String fName;
    private String lName;
    private double monthlySalary;
    private double salesBonus;
    private double yearlySalary;
    
    public EmployeeClassHelper(String fName, String lName, double yearlySalary) {
        this.fName = fName;
        this.lName = lName;
        this.yearlySalary = yearlySalary;
    }
    
    public void setYearlySalary(double monthlySalary, double salesBonus) {
        if (monthlySalary > 0.0) {
            yearlySalary = monthlySalary * 12 + salesBonus;
        }
    }
    
     public double getYearlySalary() {
        return yearlySalary; 
   } 
       // method that sets the name
   public void setfName(String name) {
      this.fName = fName; 
   } 

   // method that returns the name
   public String getfName() {
      return fName; 
   } 
   
          // method that sets the name
   public void setlName(String name) {
      this.lName = lName; 
   } 

   // method that returns the name
   public String getlName() {
      return lName; 
   } 
   
   public void getMonthlySalary() {
       this.monthlySalary = monthlySalary;
   }
   
   public void getSalesBonus() {
       this.salesBonus = salesBonus;
   }
   public double setMonthlySalary(double monthlySalary) {
       return monthlySalary;
   }
   
   public double setSalesBonus(double salesBonus) {
       return salesBonus;
   }
   
}