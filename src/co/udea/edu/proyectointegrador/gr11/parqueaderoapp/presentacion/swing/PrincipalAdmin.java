
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.presentacion.swing;

import java.awt.Color;

/**
 *
 * @author Teban-Ing
 */
public class PrincipalAdmin extends javax.swing.JFrame {

    
    public PrincipalAdmin() {
        initComponents();
        this.getContentPane().setBackground(new Color(204,204,204));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLBienvenido = new javax.swing.JLabel();
        JLBienvenido2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMBAdmin = new javax.swing.JMenuBar();
        JMArchivo = new javax.swing.JMenu();
        jMICerrarSesion = new javax.swing.JMenuItem();
        jMISalir = new javax.swing.JMenuItem();
        JMAdmin = new javax.swing.JMenu();
        jMOperarios = new javax.swing.JMenu();
        jMIAgregarOperario = new javax.swing.JMenuItem();
        jMIEliminarOperario = new javax.swing.JMenuItem();
        jMIIngresos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMIAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCAS-Administración");
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(500, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLBienvenido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLBienvenido.setText("Bienvenido al sistema de");

        JLBienvenido2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLBienvenido2.setText("control de acceso y salida de la");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Universidad de Antioquia");

        JMArchivo.setText("Archivo");

        jMICerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoOut.png"))); // NOI18N
        jMICerrarSesion.setText("Cerrar sesión");
        jMICerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICerrarSesionActionPerformed(evt);
            }
        });
        JMArchivo.add(jMICerrarSesion);

        jMISalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/liberar-icono-6437-16.png"))); // NOI18N
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        JMArchivo.add(jMISalir);

        jMBAdmin.add(JMArchivo);

        JMAdmin.setText("Administración");

        jMOperarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vigilante.png"))); // NOI18N
        jMOperarios.setText("Operarios");

        jMIAgregarOperario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        jMIAgregarOperario.setText("Agregar operario");
        jMOperarios.add(jMIAgregarOperario);

        jMIEliminarOperario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removeUser.png"))); // NOI18N
        jMIEliminarOperario.setText("Eliminar operario");
        jMIEliminarOperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEliminarOperarioActionPerformed(evt);
            }
        });
        jMOperarios.add(jMIEliminarOperario);

        JMAdmin.add(jMOperarios);

        jMIIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estadisticas.png"))); // NOI18N
        jMIIngresos.setText("Ingresos");
        JMAdmin.add(jMIIngresos);

        jMBAdmin.add(JMAdmin);

        jMenu1.setText("Ayuda");

        jMenuItem1.setText("Asistencia y documentación");
        jMenu1.add(jMenuItem1);

        jMIAcercaDe.setText("Acerca de");
        jMIAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAcercaDeActionPerformed(evt);
            }
        });
        jMenu1.add(jMIAcercaDe);

        jMBAdmin.add(jMenu1);

        setJMenuBar(jMBAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(JLBienvenido2)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLBienvenido)
                .addGap(18, 18, 18)
                .addComponent(JLBienvenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICerrarSesionActionPerformed
        InicioSesion cerrarSesion=new InicioSesion();
        cerrarSesion.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMICerrarSesionActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISalirActionPerformed

    private void jMIEliminarOperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEliminarOperarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIEliminarOperarioActionPerformed

    private void jMIAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAcercaDeActionPerformed
        About nuevo=new About(this, true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jMIAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBienvenido2;
    private javax.swing.JMenu JMAdmin;
    private javax.swing.JMenu JMArchivo;
    private javax.swing.JLabel jLBienvenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMBAdmin;
    private javax.swing.JMenuItem jMIAcercaDe;
    private javax.swing.JMenuItem jMIAgregarOperario;
    private javax.swing.JMenuItem jMICerrarSesion;
    private javax.swing.JMenuItem jMIEliminarOperario;
    private javax.swing.JMenuItem jMIIngresos;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMOperarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
