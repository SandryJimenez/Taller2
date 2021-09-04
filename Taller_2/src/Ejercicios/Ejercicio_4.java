package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Ejercicio_4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Programa para calcular Longitud y area de una circunferencia---");
        float r,lt,a;
        
        System.out.println("Favor digite el radio de la circunferencia:  ");
        r=entrada.nextFloat();
        lt=2*r;
        a=r*r;
        System.out.println("La longitud es: "+String.format("%.2f",Math.PI*lt));
        System.out.println("La Area es: "+String.format("%.2f",Math.PI*a));
        System.out.println("By: Sandry Jimenez");
    }
}
    