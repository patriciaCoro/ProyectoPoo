/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class JFSobrenombre extends javax.swing.JFrame {
    
    public static String apodo ="";
    

    /**
     * Creates new form JFSobrenombre
     */
    public JFSobrenombre() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1Guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldSobrenombre = new javax.swing.JTextField();
        jButton2Omitir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Sobrenombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jButton1Guardar.setText("Guardar");
        jButton1Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 233, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Si desea puede cambiar el nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 98, 225, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NombrePokemon:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 146, -1, -1));

        JTextFieldSobrenombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldSobrenombreActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldSobrenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 146, 160, -1));

        jButton2Omitir.setText("Omitir");
        jButton2Omitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2OmitirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Omitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 233, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondonombreaaaa.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldSobrenombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldSobrenombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldSobrenombreActionPerformed

    private void jButton1GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarActionPerformed
        if ( JTextFieldSobrenombre.getText(). length()== 0){
            JOptionPane.showMessageDialog(null,"Si no desea agregarle un sobrenombre, presione omitir");    
        }
        else{
            apodo = JTextFieldSobrenombre.getText();
            JFBatalla frame = new JFBatalla();
            frame.setVisible(true);
            
            dispose();
        }
        
    }//GEN-LAST:event_jButton1GuardarActionPerformed

    private void jButton2OmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2OmitirActionPerformed
        
        JFBatalla frame = new JFBatalla();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2OmitirActionPerformed

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
            java.util.logging.Logger.getLogger(JFSobrenombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSobrenombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSobrenombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSobrenombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSobrenombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldSobrenombre;
    private javax.swing.JButton jButton1Guardar;
    private javax.swing.JButton jButton2Omitir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
