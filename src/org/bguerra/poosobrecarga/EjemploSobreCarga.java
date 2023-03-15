package org.bguerra.poosobrecarga;

import static org.bguerra.poosobrecarga.Calculadora.*;

public class EjemploSobreCarga {
    public static void main(String[] args) {
        //Calculadora cal = new Calculadora();
        System.out.println("Sumar int : " + sumar(10, 5));
        System.out.println("Sumar float : " + sumar(10.0f, 5f));
        System.out.println("Sumar float-int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5f));
        System.out.println("Sumar double: " + sumar(10d, 5d));
        System.out.println("Sumar string: " + sumar("10", "5"));
        System.out.println("Sumar 3 int: " + sumar(10, 5, 3));
        System.out.println("Sumar 4 int: " + sumar(10, 5, 3, 4));
        System.out.println("Sumar 5 int: " + sumar(10, 5, 3, 4, 5));
        System.out.println("Sumar float + n int: " + sumar(10.5f, 5, 9, 15));
        System.out.println("Sumar 4 double: " + sumar(10.0, 5.0, 3.5, 4.5));
        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar float-int: " + sumar(10f, '@'));
    }
}
