package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.presentacion.swing;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller.OperarioController;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Operario;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.OperarioUser;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoOperarioUser;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davide.gomez
 */
public class GestionOperario extends javax.swing.JFrame {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String nombreUsuario;
    private String password;
    private String confirmPassword;
    private int idTipoOperarioUser;
    List<TipoOperarioUser> tiposOperario;

    private OperarioController controller;
    private Operario operario;

    public GestionOperario() {
        initComponents();
        agregarItems(jCBTipoOperario);
    }

    public void habilitarCamposSinExistencia() {
        jTFNombre.setEditable(true);
        jTFApellido.setEditable(true);
        jTFDireccion.setEditable(true);
        jTFTelefono.setEditable(true);
        jTFNombreUsuario.setEditable(true);
        jTFConfirmPassword.setEditable(true);
        jTFPassword.setEditable(true);
        jBAgregar.setEnabled(true);

    }

    private void habilitarCamposEnExistencia() {
        jTFNombre.setEditable(true);
        jTFApellido.setEditable(true);
        jTFDireccion.setEditable(true);
        jTFTelefono.setEditable(true);
        jTFConfirmPassword.setEditable(true);
        jTFPassword.setEditable(true);
        jBAgregar.setEnabled(false);
        jBActualizar.setEnabled(true);
        jTFCedula.setEditable(false);
    }

    public void agregarItems(JComboBox caja) {
        controller = new OperarioController();
        try {
            tiposOperario = controller.getTiposOperario();
            for (TipoOperarioUser tipo : tiposOperario) {
                caja.addItem(tipo.getDescripcion());
            }
        } catch (BussinessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private boolean validarDatosdeIngreso() {
        if (jTFNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFNombre.grabFocus();
            return false;
        }
        if (jTFApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFApellido.grabFocus();
            return false;
        }
        if (jTFDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFDireccion.grabFocus();
            return false;
        }

        if (jTFTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFTelefono.grabFocus();
            return false;
        }
        if (jTFTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFTelefono.grabFocus();
            return false;
        }
        if (jTFNombreUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFNombreUsuario.grabFocus();
            return false;
        }
        if (jTFPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFPassword.grabFocus();
            return false;
        }
        if (jTFConfirmPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Hay campos sin llenar en el formulario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            jTFConfirmPassword.grabFocus();
            return false;
        }
        char[] passwordChar = jTFPassword.getPassword();
        char[] confirmPasswordChar = jTFConfirmPassword.getPassword();
        if (!Arrays.equals(passwordChar, confirmPasswordChar)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas deben coincidir", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (jCBTipoOperario.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de operario", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }

    private void vaciarCampos() {
        jTFCedula.setText("");
        jTFNombre.setText("");
        jTFApellido.setText("");
        jTFDireccion.setText("");
        jTFTelefono.setText("");
        jTFNombreUsuario.setText("");
        jCBTipoOperario.setSelectedIndex(0);
        jCBActivo.setSelected(true);
        jBActualizar.setEnabled(false);
        jBAgregar.setEnabled(false);
        jBBuscar.setEnabled(true);

    }

    public void crearOperario(String funcion) {
        if (!validarDatosdeIngreso()) {
            return;
        }
        if (!jCBActivo.isSelected()) {
            if (JOptionPane.showConfirmDialog(this, "Está seguro que el usuario que "
                    + "se " + funcion + " esté inactivo?", "Advertencia",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE) != JOptionPane.YES_OPTION) {
                return;
            }
        }
        controller = new OperarioController();
        nombres = jTFNombre.getText();
        apellidos = jTFApellido.getText();
        direccion = jTFDireccion.getText();
        telefono = jTFTelefono.getText();
        nombreUsuario = jTFNombreUsuario.getText();

        password = String.copyValueOf(jTFPassword.getPassword());
        operario = new Operario();
        operario.setOperarioUser(new OperarioUser());
        operario.setNombre(nombres);
        operario.setApellido(apellidos);
        operario.setDireccion(direccion);
        operario.setIdentificacion(cedula);
        operario.setTelefono(telefono);
        operario.getOperarioUser().setActivo(jCBActivo.isSelected());
        operario.getOperarioUser().setPassword(password);
        operario.getOperarioUser().setNombreUsuarioOperario(nombreUsuario);
        
        for (TipoOperarioUser tiposOperario1 : tiposOperario) {
            if(tiposOperario1.getDescripcion().equals((String)jCBTipoOperario.getSelectedItem())){
                operario.getOperarioUser().setTipoOperarioUser(
                    new TipoOperarioUser(tiposOperario1.getIdTipoOperarioUser(), null));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFNombreUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFPassword = new javax.swing.JPasswordField();
        jBAgregar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTFConfirmPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jCBTipoOperario = new javax.swing.JComboBox();
        jCBActivo = new javax.swing.JCheckBox();
        jBCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();

        setResizable(false);

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Administración de operarios");

        jLabel4.setText("Nombres:");

        jTFApellido.setEditable(false);

        jLabel5.setText("Apellidos:");

        jTFNombre.setEditable(false);

        jLabel6.setText("Dirección:");

        jTFDireccion.setEditable(false);

        jLabel7.setText("Telefono:");

        jTFTelefono.setEditable(false);

        jLabel8.setText("Nombre ");

        jTFNombreUsuario.setEditable(false);

        jLabel9.setText("Contraseña:");

        jTFPassword.setEditable(false);

        jBAgregar.setText("Agregar");
        jBAgregar.setEnabled(false);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.setEnabled(false);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jLabel10.setText("Confirmar ");

        jTFConfirmPassword.setEditable(false);

        jLabel11.setText("contraseña:");

        jLabel3.setText("de usuario:");

        jCBTipoOperario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Usuario" }));

        jCBActivo.setSelected(true);
        jCBActivo.setText("Activo");

        jBCancelar.setText("Cancelar");

        jMArchivo.setText("Archivo");

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMArchivo.add(jMSalir);

        jMenuBar1.add(jMArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator1)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBTipoOperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFApellido)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(jTFDireccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jTFPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(49, 49, 49)
                                .addComponent(jCBActivo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAgregar)
                .addGap(18, 18, 18)
                .addComponent(jBActualizar)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addGap(56, 56, 56))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBActualizar, jBAgregar, jBCancelar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFNombreUsuario, jTFTelefono});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel1)
                    .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBTipoOperario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCBActivo)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jTFConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBActualizar)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBActualizar, jBAgregar, jBCancelar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        this.hide();
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        controller = new OperarioController();
        cedula = jTFCedula.getText();
        if (cedula.equals("")) {
            JOptionPane.showMessageDialog(this, "El campo de cédula no puede estar vacio",
                    "Verifique el campo de cédula", JOptionPane.ERROR_MESSAGE);
            jTFCedula.grabFocus();
            return;
        }
        try {
            operario = controller.buscarOperario(cedula);
            if (operario == null) {
                JOptionPane.showMessageDialog(this, "El operario con cedula " + cedula + "no existe.",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                habilitarCamposSinExistencia();
                return;
            }
            jTFNombre.setText(operario.getNombre());
            jTFApellido.setText(operario.getApellido());
            jTFDireccion.setText(operario.getDireccion());
            jTFTelefono.setText(operario.getTelefono());
            jTFNombreUsuario.setText(operario.getOperarioUser().getNombreUsuarioOperario());
            int idtipoOperario = operario.getOperarioUser().getTipoOperarioUser().getIdTipoOperarioUser();
            jCBTipoOperario.setSelectedIndex(idtipoOperario + 1);
            jCBActivo.setSelected(operario.getOperarioUser().isActivo());
            habilitarCamposEnExistencia();

        } catch (BussinessException | PersistentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al Buscar",
                    JOptionPane.ERROR_MESSAGE);
            habilitarCamposSinExistencia();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        crearOperario("actualizará");

        try {
            controller.actualizarOperario(operario);
            JOptionPane.showMessageDialog(this, "El operario se actualizó correctamente",
                    "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            vaciarCampos();
        } catch (BussinessException | PersistentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        crearOperario("agregará");

        try {
            controller.insertarOperario(operario);
             JOptionPane.showMessageDialog(this, "El operario se creó correctamente",
                    "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            vaciarCampos();
        } catch (BussinessException | PersistentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
        vaciarCampos();

    }//GEN-LAST:event_jBAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionOperario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JCheckBox jCBActivo;
    private javax.swing.JComboBox jCBTipoOperario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JPasswordField jTFConfirmPassword;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombreUsuario;
    private javax.swing.JPasswordField jTFPassword;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables

}
