/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe2;

/**
 *
 * @author danningersebastian
 */
public class Car extends Vehicle{

    private boolean aircondition;
    private short airbag;
    private String name;




    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h";
    }
    
    
    
    public Car(short wheels, short ps, short doors, short speed, color c,  short airbag) {
        super(wheels, ps, doors, speed,  c);
        this.aircondition = false;
        this.airbag = airbag;
    }
   
    public Car()
    {
        super();
    }
    


    public void startAircondition()
    {
        if(!aircondition)
        {
            aircondition = true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits!");
        }
    }
    
    public void stopAircondition()
    {
        if(aircondition)
        {
            aircondition = false;
        }
        else
        {
            System.out.println("Klimaanlage ist bereits aus!");
        }
    }
    
    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    
    
}
