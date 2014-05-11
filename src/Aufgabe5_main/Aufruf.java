/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe5_main;

import Aufgabe5.Benennbar2;
import Aufgabe5.Boat2;
import Aufgabe5.Car2;
import Aufgabe5.Liste2;
import Aufgabe5.Vehicle2;

/**
 *
 * @author Aßlaber
 */
public class Aufruf {
    public static void main(String[]args){
     Liste2<Benennbar2> a =  new Liste2(3);
     Benennbar2 b = new Car2();
     Benennbar2 c = new Boat2();
     Benennbar2 d = new Vehicle2();
     
     a.save(b);
     a.save(c);
     a.save(d);
    }
}
