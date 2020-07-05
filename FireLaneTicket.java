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
public class FireLaneTicket extends Object{
    private final String Tag;
    private final String Make;
    private final String Model;
    private final String Color;
    private double FireCharge;
    
    public FireLaneTicket(String Tag, String Make, String Model, String Color, double FireCharge) {
        this.Tag = Tag;
        this.Make = Make;
        this.Model = Model;
        this.Color = Color;
        this.FireCharge = FireCharge;
            
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
    public void setFireCharge(double Charge){
        this.FireCharge = Charge;
}

    //return Charge
    public double getFireCharge() {return FireCharge;}

}
