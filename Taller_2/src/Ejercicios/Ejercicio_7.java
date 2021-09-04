/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Ejercicio_7 {
    public static void main(String[]args){
        Scanner  entrada = new Scanner(System.in);
        System.out.println("Programa para calcular el % de utilidad de un producto");
        double x,y,z;
        System.out.println("Favor digite el precio de compra del poducto:  ");
        x= entrada.nextDouble();
        System.out.println("Favor digite el precio de venta del poducto:  ");
        y= entrada.nextDouble();
        
        z=(y-x)/y;
        
        System.out.println("El porcentaje de utilidad es: "+String.format("%.0f",z*100)+"%");
        System.out.println("By: Sandry Jimenez");
    }
}
    
   