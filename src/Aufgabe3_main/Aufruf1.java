/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe3_main;

import Aufgabe3.Benennbar1;
import Aufgabe3.Boat1;
import Aufgabe3.Car1;
import Aufgabe3.Vehicle1.color;

/**
 *
 * @author Aßlaber
 */
public class Aufruf1 {
    public static void main(String[] args) 
    {
        Car1 bmw = new Car1((short)4,(short) 220, (short) 4, (short) 0, color.SILVER,(short) 4);
        Car1 audi = new Car1((short)4,(short) 180, (short) 5, (short) 0, color.BLACK,(short) 4);
        Boat1 titanic = new Boat1((short)0, (short) 51000, (short) 0, (short) 0, color.BLUE, 10.54, 100000, (short) 3);
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
                

        Benennbar1 namedCar = new Car1(); 
         namedCar.setName("BMW");
         System.out.println("Das Auto heißt " + namedCar.getName());
   

    }
    
}
