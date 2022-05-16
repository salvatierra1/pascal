package com.mycompany.ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        //== Un programa que pase de decimal a binario ==
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        int decimal = entrada.nextInt();
        String binario = Integer.toBinaryString(decimal);
        System.out.println("Binario: " + binario);
        
    }
}
