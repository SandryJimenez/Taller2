
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Ejercicio_6 {
    public static void main(String[]args){
    Scanner  Hm = new Scanner(System.in);

    System.out.println("Programa para calcular el indice de mas corporal BMI de una persona ");

    double Peso, Estatua,IMC;
    System.out.println("\nFavor escriba su peso en kg:  ");
    Peso = Hm.nextDouble();
    System.out.println("\nFavor escriba su estatura sin caracteres especiales: ");
    Estatua = Hm.nextDouble();

    IMC = Peso/(Estatua*Estatua);
    System.out.println("\nSu indice de masa corporal es: "+ IMC + "\n");
    System.out.println("By: Sandry Jimenez");

 }
}

