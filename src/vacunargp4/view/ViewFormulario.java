/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import vacunargp4.control.*;
import vacunargp4.modelo.*;


public class ViewFormulario extends javax.swing.JInternalFrame {
    PersonaData pd;
    PatologiaData pat;

    
    String departamentos[] = new String[]{
    "Departamento Ayacucho (San Francisco del Monte de Oro)",
    "Departamento Belgrano (Villa General Roca)",
    "Departamento Chacabuco (Concarán)",
    "Departamento Coronel Pringles (La Toma)",
    "Departamento General Pedernera (Villa Mercedes)",
    "Departamento Gobernador Dupuy (Buena Esperanza)", 
    "Departamento Junín (Santa Rosa de Conlara)",
    "Departamento Juan Martín de Pueyrredón (San Luis)",
    "Departamento Libertador General San Martín (San Martín)"};
    String ciudades[] = new String[]{
    "San Luis (capital provincial)",
    "Villa Mercedes",
    "Villa de Merlo", 
    "Juana Koslay",
    "La Punta",
    "Justo Daract"};
    
    public ViewFormulario(PersonaData pd, PatologiaData pat) {
        initComponents();
        this.pd = pd;
        this.pat = pat;
        
        jlCuantas.setVisible(false);
        jcx1.setVisible(false);
        jcx2.setVisible(false);
        jcx3.setVisible(false);
        jlPatologia.setVisible(false);
        jlPatologia1.setVisible(false);
        jcbPatologia.setVisible(false);
        jcbPatologia1.setVisible(false);
        
        llenarCiudades();
        llenarPatologias1();
        llenarDepartamentos();
        llenarPatologias();
   
    }
    void llenarDepartamentos(){
        for(String i:departamentos){
            jcbDepartamento.addItem(i);
        }
    }
    void llenarCiudades(){
        for(String j:ciudades){
            jcbCiudad.addItem(j);
        }
    }
    private void llenarPatologias(){
        for(Patologia a:pat.traerTodoPatologia()){
            jcbPatologia.addItem(a);
        }
    }
    private void llenarPatologias1(){
        for(Patologia e:pat.traerTodoPatologia()){
            jcbPatologia1.addItem(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfAltura = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jcbCiudad = new javax.swing.JComboBox<>();
        jtfCelular = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfTrabajo = new javax.swing.JTextField();
        jbEnviar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jtfEmail2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jlError = new javax.swing.JLabel();
        jlError2 = new javax.swing.JLabel();
        jlPatologia = new javax.swing.JLabel();
        jcbPatologia = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jcxSi = new javax.swing.JCheckBox();
        jcxNo = new javax.swing.JCheckBox();
        jlCuantas = new javax.swing.JLabel();
        jcx1 = new javax.swing.JCheckBox();
        jcx2 = new javax.swing.JCheckBox();
        jcx3 = new javax.swing.JCheckBox();
        jlPatologia1 = new javax.swing.JLabel();
        jcbPatologia1 = new javax.swing.JComboBox<>();
        jbLimpiar = new javax.swing.JButton();

        jLabel1.setText("Formulario de Inscripcion VacunAr 2021");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Altura(En Metros):");

        jLabel6.setText("Peso:");

        jLabel7.setText("Fecha de Nacimiento:");

        jLabel8.setText("Celular:");

        jLabel9.setText("Email:");

        jLabel10.setText("Trabajo:");

        jLabel11.setText("Departamento:");

        jLabel12.setText("Ciudad:");

        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNombreFocusLost(evt);
            }
        });

        jbEnviar.setText("Enviar");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("@");

        jLabel14.setText(".com");

        jlError.setForeground(new java.awt.Color(204, 0, 0));

        jlError2.setForeground(new java.awt.Color(204, 0, 0));

        jlPatologia.setText("Patologia/s:");

        jLabel16.setText("Sufres de alguna Patologia?");

        jcxSi.setText("Si");
        jcxSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcxSiActionPerformed(evt);
            }
        });

        jcxNo.setText("No");
        jcxNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcxNoActionPerformed(evt);
            }
        });

        jlCuantas.setText("¿Cuantas?");

        jcx1.setText("1");
        jcx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcx1ActionPerformed(evt);
            }
        });

        jcx2.setText("2");
        jcx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcx2ActionPerformed(evt);
            }
        });

        jcx3.setText("3 o mas(Unicamente podras seleccionar 2, pero se tendra en cuenta si posees mas)");
        jcx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcx3ActionPerformed(evt);
            }
        });

        jlPatologia1.setText("Patologia/s:");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jcxSi)
                        .addGap(18, 18, 18)
                        .addComponent(jcxNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30)
                                .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlError)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlError2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jbEnviar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbLimpiar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 88, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jtfEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel14))))
                                        .addGap(9, 9, 9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlPatologia)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtfTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlPatologia1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbPatologia1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlCuantas)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcx3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcx1)
                                .addGap(18, 18, 18)
                                .addComponent(jcx2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jcxSi)
                            .addComponent(jcxNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPatologia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPatologia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPatologia1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCuantas)
                    .addComponent(jcx1)
                    .addComponent(jcx2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcx3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlError)
                            .addComponent(jlError2))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEnviar)
                    .addComponent(jButton2)
                    .addComponent(jLabel12)
                    .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        // TODO add your handling code here:
        if(jdcFecha.getDate() == null){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha.");
        }
        else{
            try{
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                String fecha = formato.format(jdcFecha.getDate());
                LocalDate fechain = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                
                String nombre = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                long dni = Long.parseLong(jtfDni.getText());
                double altura = Double.parseDouble(jtfAltura.getText());
                double peso = Double.parseDouble(jtfPeso.getText());
                
                
                String departamento = (String)jcbDepartamento.getSelectedItem();
                String ciudad = (String)jcbCiudad.getSelectedItem();
                String email = jtfEmail.getText() + "@" + jtfEmail2 + ".com";
                long telefono = Long.parseLong(jtfCelular.getText());
                String trabajo = jtfTrabajo.getText();
                
                Persona persona = new Persona(dni, nombre, apellido, altura, peso, fechain, telefono, email, trabajo, departamento, ciudad);
                pd.crearPersona(persona);
               
            }catch(NumberFormatException nb){
                JOptionPane.showMessageDialog(this, "Por favor, revise los datos.");
            }
        }
    }//GEN-LAST:event_jbEnviarActionPerformed

    private void jtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusLost
        // TODO add your handling code here:
        String val = "^[a-zA-z][^0-9]+";
        if(!jtfNombre.getText().matches(val) && !jtfNombre.getText().isEmpty()){
            jlError.setText("Error:");
            jlError2.setText("La casilla nombre no puede estar vacia o contener numeros.");
        }
    }//GEN-LAST:event_jtfNombreFocusLost

    private void jcxSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcxSiActionPerformed
        if(jcxSi.isSelected()){
            jcxNo.setSelected(false);
            jlCuantas.setVisible(true);
            jcx1.setVisible(true);
            jcx2.setVisible(true);
            jcx3.setVisible(true);
        }   
    }//GEN-LAST:event_jcxSiActionPerformed

    private void jcx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcx1ActionPerformed
        if(jcx1.isSelected()){
            jcx2.setSelected(false);
            jcx3.setSelected(false);
            jlPatologia.setVisible(true);
            jcbPatologia.setVisible(true);
            jlPatologia1.setVisible(false);
            jcbPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcx1ActionPerformed

    private void jcx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcx2ActionPerformed
        if(jcx2.isSelected()){
            jcx1.setSelected(false);
            jcx3.setSelected(false);
            jlPatologia.setVisible(true);
            jcbPatologia.setVisible(true);
            jlPatologia1.setVisible(true);
            jcbPatologia1.setVisible(true);
        }if(!jcx2.isSelected()){
            jlPatologia1.setVisible(false);
            jcbPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcx2ActionPerformed

    private void jcx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcx3ActionPerformed
        if(jcx3.isSelected()){
            jcx1.setSelected(false);
            jcx2.setSelected(false);
            jlPatologia.setVisible(true);
            jcbPatologia.setVisible(true);
            jlPatologia1.setVisible(true);
            jcbPatologia1.setVisible(true);
        }if(!jcx3.isSelected()){
            jlPatologia1.setVisible(false);
            jcbPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcx3ActionPerformed

    private void jcxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcxNoActionPerformed
        if(jcxNo.isSelected()){
            jcxSi.setSelected(false);
            jcx1.setVisible(false);
            jcx2.setVisible(false);
            jcx3.setVisible(false);
            jlCuantas.setVisible(false);
            jcbPatologia.setVisible(false);
            jcbPatologia1.setVisible(false);
            jlPatologia.setVisible(false);
            jlPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcxNoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfAltura.setText("");
        jtfCelular.setText("");
        jtfDni.setText("");
        jtfEmail.setText("");
        jtfEmail2.setText("");
        jtfPeso.setText("");
        jtfTrabajo.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbCiudad;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JComboBox<Patologia> jcbPatologia;
    private javax.swing.JComboBox<Patologia> jcbPatologia1;
    private javax.swing.JCheckBox jcx1;
    private javax.swing.JCheckBox jcx2;
    private javax.swing.JCheckBox jcx3;
    private javax.swing.JCheckBox jcxNo;
    private javax.swing.JCheckBox jcxSi;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlCuantas;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlError2;
    private javax.swing.JLabel jlPatologia;
    private javax.swing.JLabel jlPatologia1;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEmail2;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JTextField jtfTrabajo;
    // End of variables declaration//GEN-END:variables
}
