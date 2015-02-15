
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.presentacion.swing;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author davide.gomez
 */
public class PrincipalCam extends javax.swing.JFrame {
    Webcam webcam;
    WebcamPanel panel;
    String tip;
    JLabel lFotoPlaca;
    ImageIcon icon;
    Icon icono;
    
    public PrincipalCam() {
        initComponents();
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(320,240));
        lFotoPlaca=new JLabel();
        lFotoPlaca.setSize(new Dimension(320,240));
        panel = new WebcamPanel(webcam);
        panel.setVisible(true);
        panel.setBounds(0, 0, 320, 240);
        jPanelCamara.add(panel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCamara = new javax.swing.JPanel();
        jPFotoPlaca = new javax.swing.JPanel();
        jLCamaraVivo = new javax.swing.JLabel();
        jLFotoPlaca = new javax.swing.JLabel();
        jLTip = new javax.swing.JLabel();
        jTFTip = new javax.swing.JTextField();
        jTFPlacaResult = new javax.swing.JTextField();
        jLPlacaResult = new javax.swing.JLabel();
        JBEntrada = new javax.swing.JButton();
        jTFResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMICerrarSesion = new javax.swing.JMenuItem();
        jMISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelCamara.setMaximumSize(new java.awt.Dimension(320, 240));
        jPanelCamara.setMinimumSize(new java.awt.Dimension(320, 240));
        jPanelCamara.setPreferredSize(new java.awt.Dimension(320, 240));

        javax.swing.GroupLayout jPanelCamaraLayout = new javax.swing.GroupLayout(jPanelCamara);
        jPanelCamara.setLayout(jPanelCamaraLayout);
        jPanelCamaraLayout.setHorizontalGroup(
            jPanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanelCamaraLayout.setVerticalGroup(
            jPanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPFotoPlaca.setMaximumSize(new java.awt.Dimension(320, 240));
        jPFotoPlaca.setPreferredSize(new java.awt.Dimension(320, 240));

        javax.swing.GroupLayout jPFotoPlacaLayout = new javax.swing.GroupLayout(jPFotoPlaca);
        jPFotoPlaca.setLayout(jPFotoPlacaLayout);
        jPFotoPlacaLayout.setHorizontalGroup(
            jPFotoPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPFotoPlacaLayout.setVerticalGroup(
            jPFotoPlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jLCamaraVivo.setText("Camara en vivo");

        jLFotoPlaca.setText("Foto de placa");

        jLTip.setText("TIP");

        jLPlacaResult.setText("Placa-Resultado");

        JBEntrada.setText("Entrada-Salida");
        JBEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntradaActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado E/S");

        jMenu1.setText("Archivo");

        JMICerrarSesion.setText("Cerrar sesión");
        JMICerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(JMICerrarSesion);

        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFotoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLPlacaResult)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTFPlacaResult)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLFotoPlaca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLCamaraVivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTip)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addComponent(JBEntrada)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFResultado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTip))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCamaraVivo)
                    .addComponent(jLTip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBEntrada)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLFotoPlaca)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFotoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLPlacaResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPlacaResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISalirActionPerformed

    private void JMICerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICerrarSesionActionPerformed
        this.hide();
        InicioSesion nuevaSesion=new InicioSesion();
        nuevaSesion.setVisible(true);
    }//GEN-LAST:event_JMICerrarSesionActionPerformed

    private void JBEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEntradaActionPerformed
        tip=jTFTip.getText();
        if(!tip.equals("")){
            try {
                ImageIO.write(webcam.getImage(), "JPG", new File("./images/"+tip+".jpg"));
            } catch (IOException ex) {
                Logger.getLogger(PrincipalCam.class.getName()).log(Level.SEVERE, null, ex);
            }
            icon = new ImageIcon("./images/"+tip+".jpg");
            icono = new ImageIcon(icon.getImage().
                    getScaledInstance(lFotoPlaca.getWidth(),lFotoPlaca.getHeight(),
                            Image.SCALE_DEFAULT));
            lFotoPlaca.setIcon(icono);
            lFotoPlaca.setVisible(true);
            jPFotoPlaca.add(lFotoPlaca);
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese un numero de TIP", 
                    "Error al intentar verificar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBEntradaActionPerformed

    
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
            java.util.logging.Logger.getLogger(PrincipalCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEntrada;
    private javax.swing.JMenuItem JMICerrarSesion;
    private javax.swing.JLabel jLCamaraVivo;
    private javax.swing.JLabel jLFotoPlaca;
    private javax.swing.JLabel jLPlacaResult;
    private javax.swing.JLabel jLTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPFotoPlaca;
    private javax.swing.JPanel jPanelCamara;
    private javax.swing.JTextField jTFPlacaResult;
    private javax.swing.JTextField jTFResultado;
    private javax.swing.JTextField jTFTip;
    // End of variables declaration//GEN-END:variables
}
