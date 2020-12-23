/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta;

import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        ES = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Apellido1 = new javax.swing.JLabel();
        Siendo = new javax.swing.JLabel();
        Recomendacion = new javax.swing.JComboBox<>();
        Recomendacion1 = new javax.swing.JLabel();
        Seleccione = new javax.swing.JLabel();
        Atencion1 = new javax.swing.JLabel();
        Resolucion = new javax.swing.JComboBox<>();
        Resolucion1 = new javax.swing.JLabel();
        Atencion = new javax.swing.JComboBox<>();
        Enviar = new javax.swing.JButton();
        Numero = new javax.swing.JTextField();
        Numero1 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encuesta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ES.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ES.setText("Encuesta de satisfacción");
        getContentPane().add(ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        Nombre1.setText("Nombre ");
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, 20));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 220, -1));

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 220, -1));

        Apellido1.setText("Apellido");
        getContentPane().add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 20));

        Siendo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Siendo.setText(" siendo 0 el nivel más bajo y 10 el más alto");
        getContentPane().add(Siendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Recomendacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Recomendacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecomendacionActionPerformed(evt);
            }
        });
        getContentPane().add(Recomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        Recomendacion1.setText("Recomendación");
        getContentPane().add(Recomendacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        Seleccione.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Seleccione.setText("Seleccione su grado de satisfacción ");
        getContentPane().add(Seleccione, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        Atencion1.setText("Atención");
        getContentPane().add(Atencion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        Resolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Resolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolucionActionPerformed(evt);
            }
        });
        getContentPane().add(Resolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        Resolucion1.setText("Resolución");
        getContentPane().add(Resolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        Atencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Atencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtencionActionPerformed(evt);
            }
        });
        getContentPane().add(Atencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        Enviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });
        Numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroKeyTyped(evt);
            }
        });
        getContentPane().add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, -1));

        Numero1.setText("Número de cliente");
        getContentPane().add(Numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecomendacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecomendacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecomendacionActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_ApellidoActionPerformed

    private void ResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResolucionActionPerformed

    private void AtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtencionActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
            Integer n1=Atencion.getSelectedIndex();
            Integer n2=Recomendacion.getSelectedIndex();
            Integer n3=Resolucion.getSelectedIndex();
            Integer resu=(n1+n2+n3)/3;
    
                System.out.println(resu);
                frnCliente ventana2 = new frnCliente();
                ventana2.Prome.setText(resu.toString());
      
                        ventana2.setVisible(true);
        
         
    }//GEN-LAST:event_EnviarActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_NombreActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        
        JOptionPane.showMessageDialog(rootPane, "Ingresa tu nombre");
    }//GEN-LAST:event_NombreKeyTyped
    }
    
    private void ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        
        JOptionPane.showMessageDialog(rootPane, "Ingresa tu apellido");
    }                                // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoKeyTyped

    private void NumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroKeyTyped
      char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        
        JOptionPane.showMessageDialog(rootPane, "Ingresa tu número de cliente");
    }               
    }//GEN-LAST:event_NumeroKeyTyped
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JLabel Apellido1;
    private javax.swing.JComboBox<String> Atencion;
    private javax.swing.JLabel Atencion1;
    private javax.swing.JLabel ES;
    private javax.swing.JButton Enviar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JTextField Numero;
    private javax.swing.JLabel Numero1;
    private javax.swing.JComboBox<String> Recomendacion;
    private javax.swing.JLabel Recomendacion1;
    private javax.swing.JComboBox<String> Resolucion;
    private javax.swing.JLabel Resolucion1;
    private javax.swing.JLabel Seleccione;
    private javax.swing.JLabel Siendo;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

 
}
