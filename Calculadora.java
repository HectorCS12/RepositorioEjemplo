/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemploenmaven;

/**
 *
 * @author Alumno Tarde
 */
public class Calculadora {

    public Calculadora() {

    }

    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
