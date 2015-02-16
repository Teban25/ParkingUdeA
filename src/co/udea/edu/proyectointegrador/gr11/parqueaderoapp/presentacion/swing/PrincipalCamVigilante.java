
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.presentacion.swing;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller.AlprController;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.Color;
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
public class PrincipalCamVigilante extends javax.swing.JFrame {
    Webcam webcam;
    WebcamPanel panel;
    String tip;
    JLabel lFotoPlaca;
    ImageIcon icon;
    Icon icono;
    AlprController controladorAlpr;
    String rutaPlaca;
    String resultado;
    private final String mensajeResultadoPositivo="Concedido";
    private final String mensajeResultadoNegativo="Denegado";
    
    public PrincipalCamVigilante() {
        initComponents();
        this.getContentPane().setBackground(new Color(204,204,204));
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640,480));
        lFotoPlaca=new JLabel();
        lFotoPlaca.setSize(new Dimension(640,480));
        panel = new WebcamPanel(webcam);
        panel.setVisible(true);
        panel.setBounds(0, 0, 640,480);
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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 0, 0, 0));
        setResizable(false);

        jPanelCamara.setMaximumSize(new java.awt.Dimension(320, 240));
        jPanelCamara.setMinimumSize(new java.awt.Dimension(320, 240));
        jPanelCamara.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout jPanelCamaraLayout = new javax.swing.GroupLayout(jPanelCamara);
        jPanelCamara.setLayout(jPanelCamaraLayout);
        jPanelCamaraLayout.setHorizontalGroup(
            jPanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanelCamaraLayout.setVerticalGroup(
            jPanelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
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

        jLCamaraVivo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLCamaraVivo.setText("Camara en vivo");

        jLFotoPlaca.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLFotoPlaca.setText("Foto de placa");

        jLTip.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLTip.setText("TIP");

        jTFPlacaResult.setEditable(false);
        jTFPlacaResult.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jTFPlacaResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPlacaResultActionPerformed(evt);
            }
        });

        jLPlacaResult.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLPlacaResult.setText("Placa-Resultado");

        JBEntrada.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        JBEntrada.setText("Entrada-Salida");
        JBEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEntradaActionPerformed(evt);
            }
        });

        jTFResultado.setEditable(false);
        jTFResultado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Resultado E/S");

        jMenu1.setText("Archivo");

        JMICerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoOut.png"))); // NOI18N
        JMICerrarSesion.setText("Cerrar sesión");
        JMICerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(JMICerrarSesion);

        jMISalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/liberar-icono-6437-16.png"))); // NOI18N
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem1.setText("Registrar vehiculo");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLCamaraVivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTip)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFTip)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(JBEntrada)))
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPFotoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jTFPlacaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLFotoPlaca)
                        .addGap(220, 220, 220)
                        .addComponent(jLPlacaResult)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFotoPlaca)
                    .addComponent(jLPlacaResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFotoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPlacaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                Logger.getLogger(PrincipalCamVigilante.class.getName()).log(Level.SEVERE, null, ex);
            }
            rutaPlaca="./images/"+tip+".jpg";
            icon = new ImageIcon(rutaPlaca);
            icono = new ImageIcon(icon.getImage().
                    getScaledInstance(640,480,
                            Image.SCALE_DEFAULT));
            lFotoPlaca.setIcon(icono);
            lFotoPlaca.setVisible(true);
            jPFotoPlaca.add(lFotoPlaca);
            controladorAlpr=new AlprController(rutaPlaca);
            try {
                resultado=controladorAlpr.recognizePlateFromUser(tip);
                jTFPlacaResult.setText(resultado);
                jTFResultado.setSelectedTextColor(Color.GREEN);
                jTFResultado.setText(mensajeResultadoPositivo);
            } catch (BussinessException ex) {
                jTFResultado.setSelectedTextColor(Color.red);
                jTFResultado.setText(mensajeResultadoNegativo);
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese un numero de TIP", 
                    "Error al intentar verificar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBEntradaActionPerformed

    private void jTFPlacaResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPlacaResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPlacaResultActionPerformed

    
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
            java.util.logging.Logger.getLogger(PrincipalCamVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCamVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCamVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCamVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCamVigilante().setVisible(true);
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPFotoPlaca;
    private javax.swing.JPanel jPanelCamara;
    private javax.swing.JTextField jTFPlacaResult;
    private javax.swing.JTextField jTFResultado;
    private javax.swing.JTextField jTFTip;
    // End of variables declaration//GEN-END:variables
}
