/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JDialog;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Marco
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static VentanaPrincipal miVentanaPrincipal;
    
    private VentanaPrincipal() {
        initComponents();
        setResizable(false);
        try {
            setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        escritorio.add(VentanaCrearPaciente.getInstance());
        escritorio.add(VentanaConsultarPaciente.getInstance());
        escritorio.add(VentanaAcerca.getInstance());
        escritorio.add(VentanaListaPacientes.getInstance());
        escritorio.add(VentanaMediciones.getInstance());
        setVisible(true);
    }

    public static VentanaPrincipal getInstance(){
        if (miVentanaPrincipal == null)
        {
            miVentanaPrincipal = new VentanaPrincipal();
        }
        return miVentanaPrincipal;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuPaciente = new javax.swing.JMenu();
        crearPaciente = new javax.swing.JMenuItem();
        consultarPaciente = new javax.swing.JMenuItem();
        listaPaciente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEjercicios = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenu();
        salirPrograma = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness");

        escritorio.setBackground(new java.awt.Color(0, 153, 102));
        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1346, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        barraMenu.setBackground(new java.awt.Color(0, 102, 102));
        barraMenu.setBorder(null);
        barraMenu.setForeground(new java.awt.Color(0, 102, 102));
        barraMenu.setBorderPainted(false);

        menuPaciente.setBackground(new java.awt.Color(0, 102, 102));
        menuPaciente.setForeground(new java.awt.Color(255, 255, 255));
        menuPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/paciente.png"))); // NOI18N
        menuPaciente.setText("Paciente");
        menuPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPaciente.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N

        crearPaciente.setBackground(new java.awt.Color(204, 102, 0));
        crearPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mas.jpg"))); // NOI18N
        crearPaciente.setText("Crear Paciente");
        crearPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPacienteActionPerformed(evt);
            }
        });
        menuPaciente.add(crearPaciente);

        consultarPaciente.setBackground(new java.awt.Color(204, 102, 0));
        consultarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/consulta.gif"))); // NOI18N
        consultarPaciente.setText("Consultar Paciente");
        consultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPacienteActionPerformed(evt);
            }
        });
        menuPaciente.add(consultarPaciente);

        listaPaciente.setBackground(new java.awt.Color(204, 102, 0));
        listaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lista.jpg"))); // NOI18N
        listaPaciente.setText("Lista Pacientes");
        listaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPacienteActionPerformed(evt);
            }
        });
        menuPaciente.add(listaPaciente);

        jMenuItem1.setBackground(new java.awt.Color(204, 102, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/medida.png"))); // NOI18N
        jMenuItem1.setText("Medidas Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuPaciente.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(204, 102, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/rutina.png"))); // NOI18N
        jMenuItem2.setText("Rutinas Pacientes");
        menuPaciente.add(jMenuItem2);

        barraMenu.add(menuPaciente);

        menuEjercicios.setBackground(new java.awt.Color(0, 102, 102));
        menuEjercicios.setForeground(new java.awt.Color(255, 255, 255));
        menuEjercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ejercicios.jpg"))); // NOI18N
        menuEjercicios.setText("Ejercicios");
        menuEjercicios.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(204, 102, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ejercicio.jpg"))); // NOI18N
        jMenuItem3.setText("Ejercicios");
        menuEjercicios.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(204, 102, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/maquina.jpg"))); // NOI18N
        jMenuItem4.setText("Maquinas");
        menuEjercicios.add(jMenuItem4);

        barraMenu.add(menuEjercicios);

        acerca.setBackground(new java.awt.Color(0, 102, 102));
        acerca.setForeground(new java.awt.Color(255, 255, 255));
        acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acerca de.jpg"))); // NOI18N
        acerca.setText("Acerca");
        acerca.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        acerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acercaMouseClicked(evt);
            }
        });
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        barraMenu.add(acerca);

        salirPrograma.setBackground(new java.awt.Color(0, 102, 102));
        salirPrograma.setForeground(new java.awt.Color(255, 255, 255));
        salirPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir.jpg"))); // NOI18N
        salirPrograma.setText("Salir");
        salirPrograma.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        salirPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirProgramaMouseClicked(evt);
            }
        });
        barraMenu.add(salirPrograma);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPacienteActionPerformed
       VentanaConsultarPaciente.getInstance().setVisible(true);  
    }//GEN-LAST:event_consultarPacienteActionPerformed

    private void crearPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPacienteActionPerformed
       VentanaCrearPaciente.getInstance().setVisible(true);                
    }//GEN-LAST:event_crearPacienteActionPerformed

    private void salirProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirProgramaMouseClicked
      System.exit(0);
    }//GEN-LAST:event_salirProgramaMouseClicked

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        VentanaAcerca.getInstance().setVisible(true);
    }//GEN-LAST:event_acercaActionPerformed

    private void acercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaMouseClicked
        VentanaAcerca.getInstance().setVisible(true);
    }//GEN-LAST:event_acercaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaMediciones.getInstance().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void listaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPacienteActionPerformed
        VentanaListaPacientes.getInstance().setVisible(true);
    }//GEN-LAST:event_listaPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acerca;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem consultarPaciente;
    private javax.swing.JMenuItem crearPaciente;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem listaPaciente;
    private javax.swing.JMenu menuEjercicios;
    private javax.swing.JMenu menuPaciente;
    private javax.swing.JMenu salirPrograma;
    // End of variables declaration//GEN-END:variables
}
