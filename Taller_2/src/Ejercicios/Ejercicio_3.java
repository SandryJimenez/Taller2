package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author SANDRY
 */
public class Ejercicio_3 {
    public static void main(String[]args){
        Scanner entrada=new Scanner (System.in);
        System.out.println("Programa de tres valores decimales , y una serie de operaciones");
        double num1,num2,num3,sm,mt,dv,prm;
        System.out.println("Por favor ingrese un numero decimal:  ");
        num1 = entrada.nextDouble();
        System.out.println("Por favor ingrese un numero decimal:  ");
        num2 = entrada.nextDouble();
        System.out.println("Por favor ingrese un numero decimal:  ");
        num3 = entrada.nextDouble(); 
        
        sm=num1+num2+num3;
        mt=num1*num2*num3;
        dv=num1/num2/num3;
        prm=(num1+num2+num3)/3;
        
        System.out.println("La suma es: "+String.format("%.1f",sm));
        System.out.println("El promedio es: "+String.format("%.1f",prm));
        System.out.println("El producto es: "+String.format("%.1f",mt));
        System.out.println("el cociente es: "+String.format("%.1f",dv));
        System.out.println("By: Sandry Jimenez");
    }
}
   
        
        