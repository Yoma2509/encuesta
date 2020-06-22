/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yomalisvillazanaparimpar;
import java.util.Scanner;
/**
 *
 * @author josel
 */
public class YomalisVillazanaParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
    System.out.println ("Ingrese cantidad de numeros para analizar");
    int entero = leer.nextInt();
    int sumaImpar= 0;
    int sumaPar= 0 ;
    for(int i = 1; i<=entero; i++){
    
        System.out.println ("Ingrese numero " + i);
            int numero = leer.nextInt();
            if( numero % 2 == 0 ){
            sumaPar = sumaPar + numero;
        
        }else{
            sumaImpar = sumaImpar + numero;
            }
        }
            System.out.println ("Suma de numeros pares " + sumaPar );
            System.out.println ("Suma de numeros impares " + sumaImpar );
}
