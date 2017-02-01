/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("Promedio");
        //Variables
        int mat;
       double cal1,cal2, cal3, cal4, cal5, pro;
        String res;
        //uso de teclado        
        Scanner kb= new Scanner (System.in);
   System.out.println("Introduce tu matrícula");
   mat=kb.nextInt();
   System.out.println("Calificación 1");
   cal1=kb.nextDouble();
   System.out.println("Calificacion 2");
   cal2=kb.nextDouble();
        System.out.println("Calificacion 3");
    cal3=kb.nextDouble();
        System.out.println("Calificacion 4");
    cal4=kb.nextDouble();
        System.out.println("Calificacion 5");
        cal5=kb.nextDouble();
        //Formula para el promedio
        pro= (cal1+cal2+cal3+cal4+cal5)/5;
        //Promedio
        if (pro>=7){
            res= "Aprobado";
        }
        else {  res="Reprobado";
    }
        System.out.println(pro + res);
    }
    
}
