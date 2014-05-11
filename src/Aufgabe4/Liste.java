/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4;

/**
 *
 * @author Aßlaber
 */
public class Liste<T> {

    private T[] elements;

    public Liste(int size) {
        elements = (T[]) new Object[size];
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
