/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yomalisvillazanamultiplicacion;
import java.util.Scanner;
/**
 *
 * @author josel
 */
public class YomalisVillazanaMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cifra = new Scanner(System.in);
        
        int entero,contador,resultado,limite;
        contador = 1;
        
        System.out.println("Indica la tabla de multiplicar: ");
        entero = cifra.nextInt();
        
        System.out.println("Indica el límite: ");
        limite = cifra.nextInt();
        
        while (contador <= limite) {
            resultado = entero * contador;
           
            System.out.println(entero + " X " + contador + " = " + entero*contador);
            contador += 1;
        }