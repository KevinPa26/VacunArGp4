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
    List<String> departamentos = new ArrayList<>();
    String trabajo[] = new String[]{
        "Salud",
        "Educacion",
        "Comercio",
        "Empresario",
        "Otro"};
    
    String ciudades[] = new String[]{
    "San Luis (capital provincial)",
    "Villa Mercedes",
    "Villa de Merlo", 
    "Juana Koslay",
    "La Punta",
    "Justo Daract"};
    
    public ViewFormulario(PersonaData pd, PatologiaData pat) {
        initComponents();
        departamentos.add("Departamento Ayacucho (San Francisco del Monte de Oro)");
        departamentos.add("Departamento Belgrano (Villa General Roca)");
        departamentos.add("Departamento Chacabuco (Concarán)");
        departamentos.add("Departamento Coronel Pringles (La Toma)");
        departamentos.add("Departamento General Pedernera (Villa Mercedes)");
        departamentos.add("Departamento Gobernador Dupuy (Buena Esperanza)");
        departamentos.add("Departamento Junín (Santa Rosa de Conlara)");
        departamentos.add("Departamento Juan Martín de Pueyrredón (San Luis)");
        departamentos.add("Departamento Libertador General San Martín (San Martín)");
        this.pd = pd;
        this.pat = pat;
        
        jLCuantas.setVisible(false);
        jcx1.setVisible(false);
        jcx2.setVisible(false);
        jcx3.setVisible(false);
        jLPatologia.setVisible(false);
        jLPatologia1.setVisible(false);
        jcbPatologia.setVisible(false);
        jcbPatologia1.setVisible(false);
        
        llenarCiudades();
        llenarPatologias1();
        llenarDepartamentos();
        llenarPatologias();
        llenarTrabajo();
   
    }
    void llenarTrabajo(){
        for(String o:trabajo){
            jcbTrabajo.addItem(o);
        }
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
        jLTitulo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jLAltura = new javax.swing.JLabel();
        jtfAltura = new javax.swing.JTextField();
        jLPeso = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jLFecha = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLEmail = new javax.swing.JLabel();
        jtfEmail1 = new javax.swing.JTextField();
        jLArroba = new javax.swing.JLabel();
        jtfEmail2 = new javax.swing.JTextField();
        jLdotCom = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jtfCelular = new javax.swing.JTextField();
        jLTrabajo = new javax.swing.JLabel();
        jcbTrabajo = new javax.swing.JComboBox<>();
        jLDepartamento = new javax.swing.JLabel();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jLCiudad = new javax.swing.JLabel();
        jcbCiudad = new javax.swing.JComboBox<>();
        jlError = new javax.swing.JLabel();
        jlError2 = new javax.swing.JLabel();
        jLSufre = new javax.swing.JLabel();
        jcxSi = new javax.swing.JCheckBox();
        jcxNo = new javax.swing.JCheckBox();
        jLCuantas = new javax.swing.JLabel();
        jcx1 = new javax.swing.JCheckBox();
        jcx2 = new javax.swing.JCheckBox();
        jcx3 = new javax.swing.JCheckBox();
        jLPatologia = new javax.swing.JLabel();
        jcbPatologia = new javax.swing.JComboBox<>();
        jLPatologia1 = new javax.swing.JLabel();
        jcbPatologia1 = new javax.swing.JComboBox<>();
        jBEnviar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLTitulo.setText("Formulario de Inscripcion VacunAr 2021");

        jLNombre.setText("Nombre:");

        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNombreFocusLost(evt);
            }
        });
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jLApellido.setText("Apellido:");

        jLDNI.setText("DNI:");

        jLAltura.setText("Altura(En Metros):");

        jLPeso.setText("Peso:");

        jLFecha.setText("Fecha de Nacimiento:");

        jLEmail.setText("Email:");

        jtfEmail1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfEmail1FocusLost(evt);
            }
        });
        jtfEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmail1ActionPerformed(evt);
            }
        });

        jLArroba.setText("@");

        jtfEmail2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfEmail2FocusLost(evt);
            }
        });
        jtfEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmail2ActionPerformed(evt);
            }
        });

        jLdotCom.setText(".com");

        jLCelular.setText("Celular:");

        jLTrabajo.setText("Trabajo:");

        jLDepartamento.setText("Departamento:");

        jLCiudad.setText("Ciudad:");

        jlError.setForeground(new java.awt.Color(204, 0, 0));

        jlError2.setForeground(new java.awt.Color(204, 0, 0));

        jLSufre.setText("Sufres de alguna Patologia?");

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

        jLCuantas.setText("¿Cuantas?");

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

        jcx3.setText("3 o mas(Unicamente podra seleccionar 2, pero se tendra en cuenta si posee mas)");
        jcx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcx3ActionPerformed(evt);
            }
        });

        jLPatologia.setText("Patologia/s:");

        jLPatologia1.setText("Patologia/s:");

        jBEnviar.setText("Enviar");
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLApellido)
                        .addGap(224, 224, 224)
                        .addComponent(jlError)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlError2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 315, Short.MAX_VALUE)
                                .addComponent(jBEnviar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalir))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLSufre)
                        .addGap(31, 31, 31)
                        .addComponent(jcxSi)
                        .addGap(33, 33, 33)
                        .addComponent(jcxNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLFecha)
                                .addGap(34, 34, 34)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPatologia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPatologia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbPatologia1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLCelular)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLTrabajo)
                                            .addComponent(jLEmail))
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jLArroba)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLdotCom))
                                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jcbTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(47, 47, 47)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLPeso)
                                        .addComponent(jLDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLAltura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCuantas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcx1)
                        .addGap(27, 27, 27)
                        .addComponent(jcx2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcx3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDepartamento)
                            .addComponent(jLCiudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLFecha)
                                .addComponent(jLNombre)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEmail)
                            .addComponent(jtfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLArroba)
                            .addComponent(jtfEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLdotCom))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDNI)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCelular)
                            .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAltura)
                            .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTrabajo)
                            .addComponent(jcbTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPeso)
                            .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPatologia)
                            .addComponent(jcbPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPatologia1)
                            .addComponent(jcbPatologia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSufre)
                            .addComponent(jcxSi)
                            .addComponent(jcxNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCuantas)
                            .addComponent(jcx1)
                            .addComponent(jcx2))
                        .addGap(18, 18, 18)
                        .addComponent(jcx3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDepartamento)
                            .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlError)
                    .addComponent(jlError2))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEnviar)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed
        // no haya campos vacios
        if(jtfNombre.getText().equals("") || jtfApellido.getText().equals("") || jtfDNI.getText().equals("") || jtfAltura.getText().equals("") || jtfPeso.getText().equals("") || jtfEmail1.getText().equals("") || jtfEmail2.getText().equals("") || jtfCelular.getText().equals("") || jcbTrabajo.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this, "Hay campos vacios");
        }
        
        // no se selecciona fecha
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
                long dni = Long.parseLong(jtfDNI.getText());
                double altura = Double.parseDouble(jtfAltura.getText());
                double peso = Double.parseDouble(jtfPeso.getText());
                
                
                String departamento = (String)jcbDepartamento.getSelectedItem();
                String ciudad = (String)jcbCiudad.getSelectedItem();
                String email = jtfEmail1.getText() + "@" + jtfEmail2.getText() + ".com";
                long telefono = Long.parseLong(jtfCelular.getText());
                String trabajo = (String)jcbTrabajo.getSelectedItem();
                
                
                if(jcxNo.isSelected()){
                    Persona per2 = new Persona(dni, nombre, apellido, altura, peso, fechain, telefono, email, trabajo, departamento, ciudad, true);
                    pd.crearPersonaSinPato(per2);
                }else{
                    Patologia pat = (Patologia) jcbPatologia.getSelectedItem();
                    Persona per = new Persona(dni, pat, nombre, apellido, altura, peso, fechain, telefono, email, trabajo, departamento, ciudad, true);
                    pd.crearPersonaConPato(per);
                }
                
                
            }catch(NumberFormatException nb){
                JOptionPane.showMessageDialog(this, "Por favor, revise los datos.");
            }
        }
    }//GEN-LAST:event_jBEnviarActionPerformed

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
            jLCuantas.setVisible(true);
            jcx1.setVisible(true);
            jcx2.setVisible(true);
            jcx3.setVisible(true);
        }   
    }//GEN-LAST:event_jcxSiActionPerformed

    private void jcx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcx1ActionPerformed
        if(jcx1.isSelected()){
            jcx2.setSelected(false);
            jcx3.setSelected(false);
            jLPatologia.setVisible(true);
            jcbPatologia.setVisible(true);
            jLPatologia1.setVisible(false);
            jcbPatologia1.setVisible(false);
        }else{
            jLPatologia.setVisible(false);
            jcbPatologia.setVisible(false);
        }
    }//GEN-LAST:event_jcx1ActionPerformed

    private void jcx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcx2ActionPerformed
        if(jcx2.isSelected()){
            jcx1.setSelected(false);
            jcx3.setSelected(false);
            jLPatologia.setVisible(true);
            jcbPatologia.setVisible(true);
            jLPatologia1.setVisible(true);
            jcbPatologia1.setVisible(true);
        }if(!jcx2.isSelected()){
            jLPatologia1.setVisible(false);
            jcbPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcx2ActionPerformed

    private void jcx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcx3ActionPerformed
        if(jcx3.isSelected()){
            jcx1.setSelected(false);
            jcx2.setSelected(false);
            jLPatologia.setVisible(true);
            jcbPatologia.setVisible(true);
            jLPatologia1.setVisible(true);
            jcbPatologia1.setVisible(true);
        }if(!jcx3.isSelected()){
            jLPatologia1.setVisible(false);
            jcbPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcx3ActionPerformed

    private void jcxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcxNoActionPerformed
        if(jcxNo.isSelected()){
            jcxSi.setSelected(false);
            jcx1.setVisible(false);
            jcx2.setVisible(false);
            jcx3.setVisible(false);
            jLCuantas.setVisible(false);
            jcbPatologia.setVisible(false);
            jcbPatologia1.setVisible(false);
            jLPatologia.setVisible(false);
            jLPatologia1.setVisible(false);
        }
    }//GEN-LAST:event_jcxNoActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfAltura.setText("");
        jtfCelular.setText("");
        jtfDNI.setText("");
        jtfEmail2.setText("");
        jtfEmail1.setText("");
        jtfPeso.setText("");
        
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmail1ActionPerformed

    }//GEN-LAST:event_jtfEmail1ActionPerformed

    private void jtfEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmail2ActionPerformed
        
    }//GEN-LAST:event_jtfEmail2ActionPerformed

    private void jtfEmail1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmail1FocusLost
       String nousar1 = "@";
        String nousar2 = ".com";
        if(jtfEmail1.getText().contains(nousar1)){
            JOptionPane.showMessageDialog(this, "El email no debe contener '@' o '.com' estos datos se seleccionan por defecto");
    }
    }//GEN-LAST:event_jtfEmail1FocusLost

    private void jtfEmail2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmail2FocusLost
       String nousar1 = "@";
        String nousar2 = ".com";
        if(jtfEmail2.getText().contains(nousar1) || jtfEmail2.getText().contains(nousar2)){
            JOptionPane.showMessageDialog(this, "El email no debe contener '@' o '.com' estos datos se seleccionan por defecto");
        }
    }//GEN-LAST:event_jtfEmail2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLArroba;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLCuantas;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLDepartamento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPatologia;
    private javax.swing.JLabel jLPatologia1;
    private javax.swing.JLabel jLPeso;
    private javax.swing.JLabel jLSufre;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTrabajo;
    private javax.swing.JLabel jLdotCom;
    private javax.swing.JComboBox<String> jcbCiudad;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JComboBox<Patologia> jcbPatologia;
    private javax.swing.JComboBox<Patologia> jcbPatologia1;
    private javax.swing.JComboBox<String> jcbTrabajo;
    private javax.swing.JCheckBox jcx1;
    private javax.swing.JCheckBox jcx2;
    private javax.swing.JCheckBox jcx3;
    private javax.swing.JCheckBox jcxNo;
    private javax.swing.JCheckBox jcxSi;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlError2;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfEmail1;
    private javax.swing.JTextField jtfEmail2;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
