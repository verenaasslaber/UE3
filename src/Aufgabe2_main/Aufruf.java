package Aufgabe2_main;

import Aufgabe2.Benennbar;
import Aufgabe2.Boat;
import Aufgabe2.Car;
import Aufgabe2.Vehicle.color;

public class Aufruf {

    public static void main(String[] args) 
    {
        Car bmw = new Car((short)4,(short) 220, (short) 4, (short) 0, color.SILVER,(short) 4);
        Car audi = new Car((short)4,(short) 180, (short) 5, (short) 0, color.BLACK,(short) 4);
        Boat titanic = new Boat((short)0, (short) 51000, (short) 0, (short) 0, color.BLUE, 10.54, 100000, (short) 3);
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
                

        Benennbar namedCar = new Car(); 
         namedCar.setName("BMW");
         System.out.println("Das Auto heißt " + namedCar.getName());
   

    }
    
}
