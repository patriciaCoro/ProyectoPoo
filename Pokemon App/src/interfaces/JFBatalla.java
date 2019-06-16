
package interfaces;
import entidades.*;

/**
 *
 * @author alumno
 */
public class JFBatalla extends javax.swing.JFrame {
    
    
    

    /**
     * Creates new form JFPresentacion
     */
    //
    public JFBatalla() {
        initComponents();
        setLocationRelativeTo(null);
        MostrarImagen();
        MostrarPokemon();
        MostrarNombre();
        jLabel5.setText(JFPresentacion.nombre);
        
        //jLabel13.setText(JFSobrenombre.apodo);
        
        
    }
    public void MostrarImagen(){
        if (JFPresentacion.genero == "Femenino" ){
            jLabel17.setVisible(true);
            jLabel2.setVisible(false);            
        }
        else if ((JFPresentacion.genero == "Masculino" )) {
            jLabel17.setVisible(false);
            jLabel2.setVisible(true);
            
        }
        
    }
    public void MostrarPokemon(){
        if(JFSeleccionPokemon.pokemonPulsado == "a"){
            jLabelS1.setVisible(false);
            jLabelC1.setVisible(true);
            jLabelB1.setVisible(false);
            jLabelS2.setVisible(false);
            jLabelC2.setVisible(false);
            jLabelB2.setVisible(true);
            
        }
        else if(JFSeleccionPokemon.pokemonPulsado == "b"){
            jLabelS1.setVisible(false);
            jLabelC1.setVisible(false);
            jLabelB1.setVisible(true);
            jLabelS2.setVisible(true);
            jLabelC2.setVisible(false);
            jLabelB2.setVisible(false);
            
        }
        else if (JFSeleccionPokemon.pokemonPulsado == "c"){
            jLabelS1.setVisible(true);
            jLabelC1.setVisible(false);
            jLabelB1.setVisible(false);
            jLabelS2.setVisible(false);
            jLabelC2.setVisible(true);
            jLabelB2.setVisible(false);
        }
        
    }
    public void MostrarNombre(){
        if (JFSeleccionPokemon.pokemonPulsado == "a" & JFSobrenombre.opcionPulsada == "g"){
            jLabel13.setText(JFSobrenombre.apodo);
            
            
        }
        else if (JFSeleccionPokemon.pokemonPulsado == "a" & JFSobrenombre.opcionPulsada == "o"){
            jLabel13.setText("Bolbasour");
            jLabel14.setText("Charmander");
           
        }
        else if (JFSeleccionPokemon.pokemonPulsado == "b" & JFSobrenombre.opcionPulsada == "g"){
            jLabel13.setText(JFSobrenombre.apodo);
            jLabel14.setText("Bolbasour");
        }
        else if (JFSeleccionPokemon.pokemonPulsado == "b" & JFSobrenombre.opcionPulsada == "o"){
            jLabel13.setText("Squirtle");
            jLabel14.setText("Bolbasour");
            
        }
        else if (JFSeleccionPokemon.pokemonPulsado == "c" & JFSobrenombre.opcionPulsada == "g"){
            jLabel13.setText(JFSobrenombre.apodo);
            jLabel14.setText("Squirtle");
        }
        else if (JFSeleccionPokemon.pokemonPulsado == "c" & JFSobrenombre.opcionPulsada == "o"){
            jLabel13.setText("Charmander");
            jLabel14.setText("Squirtle");
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelS2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabelS1 = new javax.swing.JLabel();
        jLabelB1 = new javax.swing.JLabel();
        jLabelC2 = new javax.swing.JLabel();
        jLabelC1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelB2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entre.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 207, 414));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrena1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Severous Ouk ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("vgfr");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 140, 30));

        jLabel6.setText("Pokemon 2// *** HP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        jLabel7.setText("Pokemon 1// *** HP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabelS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Squirtle (1).png"))); // NOI18N
        getContentPane().add(jLabelS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 160, 150));

        jLabel8.setText("NIVEL X");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel9.setText("NIVEL X");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Atacar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Rendirse");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Usar poción");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrenadora.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 60, 210, -1));

        jLabelS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Squirtle (1).png"))); // NOI18N
        getContentPane().add(jLabelS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 160, 150));

        jLabelB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolbii.png"))); // NOI18N
        getContentPane().add(jLabelB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 160, 140));

        jLabelC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/char2.png"))); // NOI18N
        getContentPane().add(jLabelC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabelC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/char2.png"))); // NOI18N
        getContentPane().add(jLabelC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jiji2.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 600, 130));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 490, 170));

        jLabelB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolbii.png"))); // NOI18N
        getContentPane().add(jLabelB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 160, 140));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("aaaaa");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Squirtle");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadio3.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFBatalla().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelB1;
    private javax.swing.JLabel jLabelB2;
    private javax.swing.JLabel jLabelC1;
    private javax.swing.JLabel jLabelC2;
    private javax.swing.JLabel jLabelS1;
    private javax.swing.JLabel jLabelS2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
