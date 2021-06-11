/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;

import javax.swing.JOptionPane;
import vacunargp4.control.*;
import vacunargp4.modelo.*;

/**
 *
 * @author bebo_
 */
public class ViewInscripcion extends javax.swing.JInternalFrame {

    PersonaData pd;
    VacunatorioData vd;
    public ViewInscripcion(PersonaData pd,VacunatorioData vd) {  
        initComponents();
        this.pd = pd;
        this.vd = vd;
        jtfNombre.setEditable(false);
        jtfApellido.setEditable(false);
        jtfPatologia.setEditable(false);
        jtfTrabajo.setEditable(false);
        jlError.setVisible(false);
        jlMsj.setVisible(false);
        jlReco.setVisible(false);
        jcbSi.setVisible(false);
        jcbNo.setVisible(false);
    }
    private void vacunatorioC(Persona p){
        for(Vacunatorio x:vd.traerTodoVacunatorio()){
            if(x.getCiudad().equals(p.getCiudad())){               
                jcbVacunacion.addItem(x);
            }if(x.getDepartamento() == p.getDepartamento()){
                jcbVacunacionDpto.addItem(x);
            }else{
                jcbVacLejos.addItem(x);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfPatologia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfTrabajo = new javax.swing.JTextField();
        jlError = new javax.swing.JLabel();
        jcbSi = new javax.swing.JCheckBox();
        jcbNo = new javax.swing.JCheckBox();
        jlMsj = new javax.swing.JLabel();
        jlReco = new javax.swing.JLabel();
        jbSoli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbVacunacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlErrores = new javax.swing.JLabel();
        jcbVacunacionDpto = new javax.swing.JComboBox<>();
        jcbVacLejos = new javax.swing.JComboBox<>();

        jLabel1.setText("Cita vacunAr 2021");

        jLabel2.setText("Dni:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunargp4/view/boton.jpeg"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Patologia:");

        jLabel6.setText("Trabajo:");

        jlError.setText("Consideras que hay un dato erroneo?");

        jcbSi.setText("Si");
        jcbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSiActionPerformed(evt);
            }
        });

        jcbNo.setText("No");
        jcbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNoActionPerformed(evt);
            }
        });

        jlMsj.setText("Te recomendamos:");

        jlReco.setText("Ir a: \"Formulario/Buscar/Actualizar\"");

        jbSoli.setText("Solicitar una Cita para vacunAr");
        jbSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSoliActionPerformed(evt);
            }
        });

        jLabel7.setText("Centros de Vacunacion Cercanos:");

        jLabel8.setText("Centro de Vacunacion por Dpto:");

        jLabel9.setText("Centros de Vacunacion Disponibles:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlError)
                .addContainerGap(538, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbSi)
                        .addGap(34, 34, 34)
                        .addComponent(jlMsj)
                        .addGap(33, 33, 33)
                        .addComponent(jcbNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDni)
                            .addComponent(jtfNombre)
                            .addComponent(jtfApellido)
                            .addComponent(jtfPatologia)
                            .addComponent(jtfTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jcbVacLejos, 0, 249, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbVacunacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbVacunacionDpto, 0, 260, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jlReco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSoli))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlErrores)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlErrores)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jcbVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jcbVacunacionDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jcbVacLejos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlError)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSi)
                    .addComponent(jcbNo)
                    .addComponent(jlMsj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSoli)
                    .addComponent(jlReco))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            long dni = Long.parseLong(jtfDni.getText());
            Persona ej = pd.buscarPersonaDni(dni);
            jtfNombre.setText(ej.getNombre());
            jtfApellido.setText(ej.getApellido());
            if(ej.getPatologia() == null){
                jtfPatologia.setText("Ninguna.");
            }else{
                jtfPatologia.setText(ej.getPatologia().toString());
            }
            jtfTrabajo.setText(ej.getTrabajo());
            jlError.setVisible(true);
            jcbSi.setVisible(true);
            jcbNo.setVisible(true);
            vacunatorioC(ej);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dni invalido, por favor: Ingrese solo numeros.");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSiActionPerformed
       jcbNo.setSelected(false);
       jlError.setVisible(true);
       jlMsj.setVisible(true);
       jlReco.setVisible(true);
    }//GEN-LAST:event_jcbSiActionPerformed

    private void jcbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNoActionPerformed
        jcbSi.setSelected(false);
       
       jlMsj.setVisible(false);
       jlReco.setVisible(false);
    }//GEN-LAST:event_jcbNoActionPerformed

    private void jbSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSoliActionPerformed
        
    }//GEN-LAST:event_jbSoliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSoli;
    private javax.swing.JCheckBox jcbNo;
    private javax.swing.JCheckBox jcbSi;
    private javax.swing.JComboBox<Vacunatorio> jcbVacLejos;
    private javax.swing.JComboBox<Vacunatorio> jcbVacunacion;
    private javax.swing.JComboBox<Vacunatorio> jcbVacunacionDpto;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlErrores;
    private javax.swing.JLabel jlMsj;
    private javax.swing.JLabel jlReco;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPatologia;
    private javax.swing.JTextField jtfTrabajo;
    // End of variables declaration//GEN-END:variables
}
