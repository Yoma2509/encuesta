/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yomalisvillazanatarea9;
import java.util.Scanner;
/**
 *
 * @author josel
 */
public class YomalisVillazanaTarea9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero1,numero2,ope;
       
       Scanner leer  = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1: ");
        
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese el numero 2: ");
        
        numero2 = leer.nextInt();
        
        System.out.println("Ingrese una operacion \n 1 -> sumar \n 2 -> multiplicar \n 3 -> restar \n 4 -> dividir \n Ejemplo 1 :");
        ope = leer.nextInt();
                
       switch (ope){
           
           case 1:
               
               System.out.println("Resultado de la suma " + (numero1 + numero2));
              
             break;
            
           case 2:
               
               System.out.println("Resultado de la multiplicación " + (numero1 * numero2));
              
             break;
             
            case 3:
               
               System.out.println("Resultado de la resta " + (numero1 - numero2));
              
             break;
            
           case 4:
               
               System.out.println("Resultado de la multiplicación " + (numero1 / numero2));
              
             break;
             
           default : 
               
               System.out.println("Operacion no valida");
               
       }
    }
    
}
   
