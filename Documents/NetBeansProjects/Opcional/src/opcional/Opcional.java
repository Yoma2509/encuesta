/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcional;
import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Opcional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un número: "); 
        Scanner leer = new Scanner(System.in);
            
        int numDia = leer.nextInt();
        switch(numDia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;    
            default:
                System.out.println("Día de la semana no valido");
        }
      
    }
    
}
