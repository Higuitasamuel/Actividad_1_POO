package com.mycompany.actividad1_poo;

import java.util.Scanner;

public class ejercicio_17 {
    public static void main (String[] args){
        double radio,area, longitud;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo:");
        radio= entrada.nextInt();
        area=Math.PI * Math.pow (radio, 2);
        longitud=2 * Math.PI * radio;
        System.out.println("El area es: "+ + area);
        System.out.println("La longitud es: "+ + longitud);

    }
}
