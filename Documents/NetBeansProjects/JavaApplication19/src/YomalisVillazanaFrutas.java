/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author josel
 */
public class YomalisVillazanaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
             String[] Frutas = new String[3];
             Scanner leer = new Scanner(System.in);
             
             for(int i=0 ;i < 3;i++ ){
                 
                 System.out.print("Ingrese una fruta: ");
                 Frutas[i] = leer.next();
                              
             }
             
          
          int contador = 0;
          for (String frutas: Frutas){
            System.out.println("Fruta -> " + Frutas [contador]);
            contador++;
          }
                 
    }
    
}
    
   

