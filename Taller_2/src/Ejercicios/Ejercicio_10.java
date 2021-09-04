
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Ejercicio_10 {
        public static void main(String[]args){
            Scanner entrada=new Scanner (System.in);  
            System.out.println("Programa para convertir unidades de masa");
            double kg,g,lb,tn;
            System.out.println("Favor digite el peso en Kilogramos:  ");
            kg=entrada.nextDouble();
            g=kg*1000;
            lb=(double) (kg*(2.20462));
            tn=kg/1000;
            System.out.println("Coversion a gramos es: "+g);
            System.out.println("Coversion a libras es: "+lb);
            System.out.println("Coversion a toneladas es: "+tn);
            System.out.println("By: Sandry Jimenez");
            }
       
 
}
