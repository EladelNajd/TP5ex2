/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5ex2;
import java.lang.Math;

/**
 *
 * @author LENOVO
 */
public class MathOperations {
    
      public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nombre négatif passé :" +n);
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double calculateSquareRoot(double x) {
        if (x < 0) {
            throw new ArithmeticException(" Tentative de calcul de la racine carrée d’un nombre négatif :" +x);
        }
        return Math.sqrt(x);
    }
    
}
