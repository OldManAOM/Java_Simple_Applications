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
public abstract class Ticket {

    private String Tag;
    private String Make;
    private String Model;
    private String Color;
    
    public Ticket(String Tag, String Make, String Model, String Color){
        this.Tag = Tag;
        this.Make = Make;
        this.Model = Model;
        this.Color = Color;
    }
    // return Tag

    public String getTag() {
        return Tag;
    }
    public void setTag(String Tag){
        this.Tag = Tag;
}

    //return Make
    public String getMake() {
        return Make;
    }
    public void setMake(String Make){
        this.Make = Make;
}

    //return Model
    public String getModel() {
        return Model;
    }
    public void setModel(String Model){
        this.Model = Model;
}

    //return Color
    public String getColor() {
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
}
    public abstract String printTicket();

    //set Charge amount
}

