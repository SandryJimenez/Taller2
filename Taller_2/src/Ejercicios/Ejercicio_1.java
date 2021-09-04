
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author SANDRY
 */
public class Ejercicio_1 {
    public static void main(String[]args){
        Scanner entrada=new Scanner (System.in);
        System.out.print("Programa para que lea dos datos de tipo entero ");
        System.out.print("Favor Digite un Numero: ");
         int numero1 = entrada.nextInt();
            System.out.print("Favor Digite otro numero: ");
         int numero2 = entrada.nextInt();

            System.out.printf("x=%d\n", numero1);
            System.out.printf("El valor de %d + %d es %d\n", numero1, numero1, ( numero1 + numero1 ) );

            System.out.printf("x=%.2f\n", x(numero1,numero2));
            System.out.printf("%d - %d\n", ( numero1 + numero2 ), ( numero2 + numero1 ) );
            System.out.println("By: Sandry Jimenez");


    }
        public static double x(int a, int b){
           
        return (double) a / 1 ;
    }
   }
