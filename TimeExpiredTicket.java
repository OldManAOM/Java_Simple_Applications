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
public class TimeExpiredTicket extends Object {
    private final String Tag;
    private final String Make;
    private final String Model;
    private final String Color;
    private double timeCharge;
    
    public TimeExpiredTicket(String Tag, String Make, String Model, String Color, double timeCharge) {
        this.Tag = Tag;
        this.Make = Make;
        this.Model = Model;
        this.Color = Color;
        this.timeCharge = timeCharge;
            
    }
    // return Tag
    public String getTag() {return Tag;}    

    //return Make
    public String getMake() {return Make;}

    //return Model
    public String getModel() {return Model;}

    //return Color
    public String getColor() {return Color;}

    //set Charge amount
    public void setTimeCharge(double Charge){
        this.timeCharge = Charge;
}

    //return Charge
    public double getTimeCharge() {return timeCharge;}

    
}



