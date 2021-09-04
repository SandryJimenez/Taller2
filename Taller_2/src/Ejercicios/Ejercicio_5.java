
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Ejercicio_5 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor dijite un caracter: ");
        char ct=entrada.next().charAt(0);
        int caracter=(int)ct;
        System.out.println("El valor numerico en la tabla ASCCI es:"+caracter);
        System.out.println("By: Sandry Jimenez");
}
}