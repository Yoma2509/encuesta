/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entero;

/**
 *
 * @author josel
 */
public class Entero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Respuesta 1 - 2
        int numero1,numero2,suma;
        
        numero1 = 10;
        numero2 = 6;
        suma = numero1 + numero2;
        System.out.println(suma);             
   
        //Respuesta 3
        float decimal1;
        
        decimal1 = 1.34f;
        System.out.println(decimal1);  
        
        //Respuesta 4
        char caracter1;
       
        caracter1 = 'f';
        
        System.out.println(caracter1);
        
        //Respuesta 5, no estoy segura si era solo declarar asi
        // o crear una secuencia logica como el de la lampara
        
        boolean esverdadero;
        
        esverdadero = true;
        
        System.out.println(esverdadero);
        
        //Respuesta 6, como ya estaban declarados arriba me fui por lo simple
        
         float suma2 = (float)numero1+decimal1;         
               
        System.out.println(suma2);
        
        //Respuesta 8, 
        
       
        
        double dividir = (double)numero1/numero2;         
               
        System.out.println(dividir);
        
       // Respuesta 9, esta me confundi un poco. La deje así.
        
       String cadena1 = "Hola mundo"; 
       
       System.out.println(cadena1);
        
                   
       // Respuesta  10, no segui el punto 11 y 12 porque segun entendí el 
       // el numero constante no cambia.
       
        final int numero_constante = 2;
       
       
        System.out.println(numero_constante);
       
              
       
                }
    
  
    
}
