/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;

import vacunargp4.control.*;

/**
 *
 * @author bebo_
 */
public class ViewMenu extends javax.swing.JFrame {
    Conexion con = new Conexion();
    PersonaData pd = new PersonaData(con);
    PatologiaData pat = new PatologiaData(con);
    VacunatorioData vd = new VacunatorioData(con);
    LaboratorioData ld = new LaboratorioData(con);
    DosisData dd = new DosisData(con);
    CitaVacunacionData cvd = new CitaVacunacionData(con);
    
    public ViewMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmPersonas = new javax.swing.JMenu();
        jmiFormulario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiCrearCita = new javax.swing.JMenuItem();
        jmiEstado = new javax.swing.JMenuItem();
        jmCentro = new javax.swing.JMenu();
        jmLaboratorio = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jmPersonas.setText("Personas");

        jmiFormulario.setText("Formulario de Inscripcion");
        jmiFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioActionPerformed(evt);
            }
        });
        jmPersonas.add(jmiFormulario);

        jMenuBar1.add(jmPersonas);

        jMenu2.setText("Citas");

        jmiCrearCita.setText("Crear Cita");
        jmiCrearCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearCitaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCrearCita);

        jmiEstado.setText("Modificar Cita");
        jmiEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstadoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiEstado);

        jMenuBar1.add(jMenu2);

        jmCentro.setText("Centro de Vacunacion");
        jmCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCentroMouseClicked(evt);
            }
        });
        jmCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCentroActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmCentro);

        jmLaboratorio.setText("Laboratorio");
        jmLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmLaboratorioMouseClicked(evt);
            }
        });
        jmLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLaboratorioActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmLaboratorio);

        jMenu3.setText("Dosis");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewFormulario vf = new ViewFormulario(pd,pat);
        vf.setVisible(true);
        escritorio.add(vf);
        escritorio.moveToFront(vf);
    }//GEN-LAST:event_jmiFormularioActionPerformed

    private void jmiCrearCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearCitaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewCrearCita vcc = new ViewCrearCita(cvd,dd,vd,pd);
        vcc.setVisible(true);
        escritorio.add(vcc);
        escritorio.moveToFront(vcc);
    }//GEN-LAST:event_jmiCrearCitaActionPerformed

    private void jmCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCentroActionPerformed
        
    }//GEN-LAST:event_jmCentroActionPerformed

    private void jmCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCentroMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        viewCentroVacunacion vc = new viewCentroVacunacion(vd);
        vc.setVisible(true);
        escritorio.add(vc);
        escritorio.moveToFront(vc);
    }//GEN-LAST:event_jmCentroMouseClicked

    private void jmLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLaboratorioActionPerformed
        
    }//GEN-LAST:event_jmLaboratorioActionPerformed

    private void jmLaboratorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmLaboratorioMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        ViewLaboratorio vl = new ViewLaboratorio(ld);
        vl.setVisible(true);
        escritorio.add(vl);
        escritorio.moveToFront(vl);
    }//GEN-LAST:event_jmLaboratorioMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        ViewDosis vd = new ViewDosis(dd, ld);
        vd.setVisible(true);
        escritorio.add(vd);
        escritorio.moveToFront(vd);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jmiEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstadoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewCitaAplicacion  ca= new ViewCitaAplicacion(cvd, dd, pd);
        ca.setVisible(true);
        escritorio.add(ca);
        escritorio.moveToFront(ca);
    }//GEN-LAST:event_jmiEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmCentro;
    private javax.swing.JMenu jmLaboratorio;
    private javax.swing.JMenu jmPersonas;
    private javax.swing.JMenuItem jmiCrearCita;
    private javax.swing.JMenuItem jmiEstado;
    private javax.swing.JMenuItem jmiFormulario;
    // End of variables declaration//GEN-END:variables
}
