/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;
 import javax.swing.*;
/**
 *
 * @author josel
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        String[] altaGama = {"BMW", "AUDI", "VOLVO"};
        String modeloS = "";
        boolean gama = false;
        int modelo,año,cuota;
        
        boolean logueo = login ();
        
        if (logueo){
            
            modeloS = JOptionPane.showInputDialog("Ingrese el modelo de su auto");
            año = Integer.parseInt (JOptionPane.showInputDialog("Ingrese año del carro"));
            modeloS = modeloS.toUpperCase();
        
        gama = buscador(altaGama, modeloS);     
               
        if (!gama){
            modelo = 890;
        } else modelo = 1800;{
        
            cuota = modelo+cotizador(año);   
          
            JOptionPane.showMessageDialog(null,"Modelo del carro: "+modeloS+"\nAño: "+año+"\nCosto final: $"+cuota);        
                }
        
            }  else {
        
             JOptionPane.showMessageDialog(null ,"Acceso denegado" , "Hasta Pronto",JOptionPane.INFORMATION_MESSAGE );
                    }
          }
     public static boolean buscador (String []altaGama, String modeloS){
        boolean otros=false;
        for (String i:altaGama){
            if (i.equals(modeloS)){                
                otros=true;
            }
        }
        return otros;
}
    public static int cotizador(int cuota){
        int Final=0;
         
        if (cuota>=0 && cuota<=1989){
            Final=350;
        } else if (cuota>=1990 && cuota<=1999){
            Final=480;
        } else if (cuota>=2000 && cuota<=2010){
            Final=780;
        } else if (cuota>=2011 && cuota<=2016){
            Final=950;
        } else if (cuota>=2017 && cuota<=2020){
            Final=1200;
        }
        return Final;
                    
    }    
 
     public static boolean login () {   
      String [] baseU = {"Yoma","Jose"};
      String [] baseP = {"Yomalis","Joseluis"};
      int intentos = 1;    
      boolean respuesta = false;  
      
    JTextField username = new JTextField(); 
    JTextField password = new JPasswordField(); 
        Object[] message = { 
     
     "Usuario:", username, 
     "Contraseña:", password
        }; 
                 
    do{
        JOptionPane.showConfirmDialog(null, message, "Ingrese sus datos, por favor: ", JOptionPane.OK_CANCEL_OPTION); 
   
    respuesta = buscadorl ( baseU, baseP, username, password );
    
    if (respuesta) { 
		
		JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado " + "satisfactoriamente al sistema", "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE); 
		
                } else { 
                JOptionPane.showMessageDialog(null, "Acceso denegado:\n" + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado", JOptionPane.ERROR_MESSAGE); 
                intentos ++;
                     }
                }while (intentos <= 3 && (!respuesta));
   
    
                    return respuesta;
}
    
     
  public static boolean buscadorl (String [] baseU, String [] baseP, JTextField username, JTextField password   ){
                       
     for( String  A : baseU){
        for( String  B : baseP){
         if( A.equals(username.getText() ) && B.equals(password.getText()) ){
             
            return true;
                                    }
                                  }   
                                } 
            return false;
      }
          }     

        

 

