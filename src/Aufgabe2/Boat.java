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
public class Boat extends Vehicle{

    private double draft, cargo;
    private short propeller;
    
    public Boat(short wheels, short ps, short doors, short speed, 
            color c, double draft, double cargo, short propeller) {
        super(wheels, ps, doors, speed,  c);
        this.draft = draft;
        this.cargo = cargo;
        this.propeller = propeller;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPs() + " PS und einen Tiefgang von " + getDraft() + " m";
    }
    
    
    
    public void unload() throws InterruptedException
    {
        Thread.sleep(5000);
        setCargo(0);
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }
    
    
}
