/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marco
 */
public class VentanaModificarPaciente extends javax.swing.JInternalFrame {

    private static VentanaModificarPaciente miVentanaModificarPaciente;
    
    /**
     * Creates new form ventanaCrearPaciente
     */
    VentanaModificarPaciente() {
        initComponents();
        setResizable(false);
    }
    public static VentanaModificarPaciente getInstance()
    {
        if(miVentanaModificarPaciente == null)
        {
            miVentanaModificarPaciente = new VentanaModificarPaciente();
        }
        return miVentanaModificarPaciente;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrearPaciente = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        lblApellido1 = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        boxSexo = new javax.swing.JComboBox();
        fieldApellido1 = new javax.swing.JTextField();
        fieldApellido2 = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        fieldCedula = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JTextField();
        fieldCorreo = new javax.swing.JTextField();
        dateFecha = new com.toedter.calendar.JDateChooser();
        btnCrear = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblIcono1 = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Modificar Paciente");

        panelCrearPaciente.setBackground(new java.awt.Color(0, 153, 102));

        lblNombre.setText("Nombre");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        lblApellido1.setText("Primer Apellido");

        lblApellido2.setText("Segundo Apellido");

        lblSexo.setText("Sexo");

        boxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Masculino", "Femenino" }));
        boxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSexoActionPerformed(evt);
            }
        });

        fieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellido2ActionPerformed(evt);
            }
        });

        lblCedula.setText("Número de identificación");

        lblFecha.setText("Fecha de nacimiento");

        lblTelefono.setText("Teléfono");

        lblCorreo.setText("Correo Electrónico");

        btnCrear.setText("Modificar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblIcono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pacientes.png"))); // NOI18N

        javax.swing.GroupLayout panelCrearPacienteLayout = new javax.swing.GroupLayout(panelCrearPaciente);
        panelCrearPaciente.setLayout(panelCrearPacienteLayout);
        panelCrearPacienteLayout.setHorizontalGroup(
            panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo)
                            .addComponent(lblTelefono)
                            .addComponent(lblFecha)
                            .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnCrear)))
                        .addGap(23, 23, 23)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(43, 43, 43)
                                .addComponent(btnSalir))
                            .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido1)
                            .addComponent(lblApellido2)
                            .addComponent(lblSexo)
                            .addComponent(lblCedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(lblIcono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCrearPacienteLayout.setVerticalGroup(
            panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblIcono1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido1))
                .addGap(14, 14, 14)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido2)
                    .addComponent(fieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono)
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCorreo)
                    .addComponent(fieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCrear))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSexoActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    fieldNombre.setText("");
    fieldApellido1.setText("");
    fieldApellido2.setText("");
    boxSexo.setSelectedIndex(0);
    fieldCedula.setText("");
    dateFecha.setDate(null);
    fieldTelefono.setText("");
    fieldCorreo.setText("");  
    this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void fieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellido2ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    fieldNombre.setText("");
    fieldApellido1.setText("");
    fieldApellido2.setText("");
    boxSexo.setSelectedIndex(0);
    fieldCedula.setText("");
    dateFecha.setDate(null);
    fieldTelefono.setText("");
    fieldCorreo.setText(""); 
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxSexo;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JTextField fieldApellido1;
    private javax.swing.JTextField fieldApellido2;
    private javax.swing.JTextField fieldCedula;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIcono1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelCrearPaciente;
    // End of variables declaration//GEN-END:variables
}
