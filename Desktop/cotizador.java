/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author josel
 */
public class cotizador {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        String[] altaGama = {"BMW", "AUDI", "VOLVO"};
        String modeloS = "";
        boolean gama = false;
        int modelo,año,cuota;
       
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
    }
    
     public static boolean buscador(String []altaGama, String modeloS){
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
}

