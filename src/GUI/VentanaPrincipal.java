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
        lblIcono = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuPaciente = new javax.swing.JMenu();
        crearPaciente = new javax.swing.JMenuItem();
        consultarPaciente = new javax.swing.JMenuItem();
        listaPaciente = new javax.swing.JMenuItem();
        menuEjercicios = new javax.swing.JMenu();
        acercade = new javax.swing.JMenu();
        salirPrograma = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness");

        escritorio.setBackground(new java.awt.Color(0, 153, 102));
        escritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        escritorio.setForeground(new java.awt.Color(0, 102, 102));

        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icono.png"))); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorio.setLayer(lblIcono, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        menuPaciente.add(listaPaciente);

        barraMenu.add(menuPaciente);

        menuEjercicios.setBackground(new java.awt.Color(0, 102, 102));
        menuEjercicios.setForeground(new java.awt.Color(255, 255, 255));
        menuEjercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ejercicios.jpg"))); // NOI18N
        menuEjercicios.setText("Ejercicios");
        menuEjercicios.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        barraMenu.add(menuEjercicios);

        acercade.setBackground(new java.awt.Color(0, 102, 102));
        acercade.setForeground(new java.awt.Color(255, 255, 255));
        acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acerca de.jpg"))); // NOI18N
        acercade.setText("Acerca de");
        acercade.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        barraMenu.add(acercade);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarPacienteActionPerformed

    private void crearPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPacienteActionPerformed
        // TODO add your handling code here:
        VentanaCrearPaciente.getInstance().setVisible(true);
                
    }//GEN-LAST:event_crearPacienteActionPerformed

    private void salirProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirProgramaMouseClicked
      System.exit(0);
    }//GEN-LAST:event_salirProgramaMouseClicked

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
    private javax.swing.JMenu acercade;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem consultarPaciente;
    private javax.swing.JMenuItem crearPaciente;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JMenuItem listaPaciente;
    private javax.swing.JMenu menuEjercicios;
    private javax.swing.JMenu menuPaciente;
    private javax.swing.JMenu salirPrograma;
    // End of variables declaration//GEN-END:variables
}
