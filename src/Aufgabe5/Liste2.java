/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe5;

/**
 *
 * @author Aßlaber
 */
//                      Einschrenkung für den Gernertic T
public class Liste2<T extends Benennbar2> {
    
    private Benennbar2[] elements;

    public Liste2(int size) {
        elements = new Benennbar2[size];
    }

    public void save(T element) {
        for (int i = 0; i < elements.length; i++) {
            //wenn ein leerer array an der Stelle i leer ist
            if (elements[i] == null) {
                //überschreibe array an der Stelle i mit element
                elements[i] = element;
                System.out.println("Der Wert " + element + " wurde bei der Stelle " + i + " gespeichert.");
                //ohne break würde 2.0 in JEDE freie Stelle gespeichert werden
                break;
            }
        }

    }

}
