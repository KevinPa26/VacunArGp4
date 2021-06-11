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
    
    String depAya[] = new String[]{
    "Candelaria",
    "La Majada",
    "Leandro N. Alem",
    "Luján",
    "Quines",
    "Río Juan Gómez",
    "San Francisco del Monte de Oro"};
    
    String depPuey[] = new String[]{
    "San Luis (capital provincial)",
    "Alto Pencoso",
    "Balde", 
    "Beazley",
    "Cazador",
    "Chosmes",
    "Desaguadero",
    "El Volcán",
    "Jarilla",
    "Juana Koslay", 
    "La Punta",
    "Mosmota",
    "Potrero de los Funes",
    "Salinas del Bebedero",
    "San Gerónimo",
    "Zanjitas"};
    
    String depBel[] = new String[]{
     "La Calera ",
    "Nogolí "  ,
    "Villa de la Quebrada "  ,
    "Villa General Roca"  
    };
    String depCha[] = new String[]{
        "Concarán",
"Cortaderas",
"Naschel",
"Papagayos",
"Renca",
"San Pablo",
"Tilisarao",
"Villa del Carmen",
"Villa Larca"
    };
    String depPeder[] = new String[]{
        "Juan Jorba",
    "Juan Llerena",
    "Justo Daract",
    "La Esquina",
    "La Punilla",
    "Lavaisse",
    "San José del Morro",
    "Villa Mercedes"
    };
    String depPrin[] = new String[]{
        "Carolina",
"El Trapiche",
"Fraga",
"La Bajada",
"La Florida",
"La Toma",
"Riocito",
"Saladillo",
"Estancia Grande"
    };
    String depJuj[] = new String[]{
        "Carpintería",
"Cerro de Oro",
"Lafinur",
"Los Cajones",
"Los Molles",
"Merlo",
"Santa Rosa de Conlara",
"Talita"
    };
    String depDup[] = new String[]{
      "Anchorena",
"Arizona",
"Bagual",
"Batavia",
"Buena Esperanza",
"Fortín El Patria",
"Fortuna",
"La Maroma",
"Martín de Loyola",
"Nahuel Mapá",
"Navia",
"Nueva Galia",
"Unión"  
    };
    String depMart[] = new String[]{
      "Anchorena",
"Arizona",
"Bagual",
"Batavia",
"Buena Esperanza",
"Fortín El Patria",
"Fortuna",
"La Maroma",
"Martín de Loyola",
"Nahuel Mapá",
"Navia",
"Nueva Galia",
"Unión"  
    };
    public ViewFormulario(PersonaData pd, PatologiaData pat) {
        initComponents();
        departamentos.add("Ayacucho");
        departamentos.add("Belgrano");
        departamentos.add("Chacabuco");
        departamentos.add("Coronel Pringles");
        departamentos.add("General Pedernera");
        departamentos.add("Gobernador Dupuy");
        departamentos.add("Junín");
        departamentos.add("Pueyrredón");
        departamentos.add("Libertador General San Martín");
        this.pd = pd;
        this.pat = pat;        
        jLCuantas.setVisible(false);
        jcbPatologia.setVisible(false);
        jlDNI.setVisible(false);
        jtfBuscarDNI.setVisible(false);
        jbBuscar.setEnabled(false);
        jbActualizar.setEnabled(false);
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

    private void llenarPatologias(){
        for(Patologia a:pat.traerTodoPatologia()){
            jcbPatologia.addItem(a);
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
        jcbPatologia = new javax.swing.JComboBox<>();
        jBEnviar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jlDNI = new javax.swing.JLabel();
        jtfBuscarDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcxYes = new javax.swing.JCheckBox();
        jcxNoB = new javax.swing.JCheckBox();
        jbBuscar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();

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

        jLCelular.setText("Celular:");

        jLTrabajo.setText("Trabajo:");

        jLDepartamento.setText("Departamento:");

        jcbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDepartamentoActionPerformed(evt);
            }
        });

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

        jLCuantas.setText("Que patologia sufre :");

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

        jlDNI.setText("DNI:");

        jLabel1.setText("Quieres ver tus datos?");

        jcxYes.setText("Si");
        jcxYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcxYesActionPerformed(evt);
            }
        });

        jcxNoB.setText("No");
        jcxNoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcxNoBActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");

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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar)
                                .addGap(18, 18, 18)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDNI)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLFecha)
                                            .addGap(34, 34, 34)
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(17, 17, 17)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jcbTrabajo, 0, 222, Short.MAX_VALUE)
                                                        .addComponent(jtfBuscarDNI)))
                                                .addComponent(jtfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(47, 47, 47))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcxYes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcxNoB)
                                    .addGap(21, 21, 21))))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCuantas)
                        .addGap(32, 32, 32)
                        .addComponent(jcbPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDepartamento)
                            .addComponent(jLCiudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitulo)
                .addGap(18, 18, 18)
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
                    .addComponent(jtfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPeso)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSufre)
                            .addComponent(jcxSi)
                            .addComponent(jcxNo))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCuantas)
                            .addComponent(jcbPatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDepartamento)
                            .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCiudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlError)
                            .addComponent(jlError2))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEnviar)
                            .addComponent(jBSalir)
                            .addComponent(jBLimpiar)
                            .addComponent(jbBuscar)
                            .addComponent(jbActualizar))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcxYes)
                            .addComponent(jcxNoB))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDNI)
                            .addComponent(jtfBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed
        // no haya campos vacios
        if(jtfNombre.getText().equals("") || jtfApellido.getText().equals("") || jtfDNI.getText().equals("") || jtfAltura.getText().equals("") || jtfPeso.getText().equals("") || jtfEmail1.getText().equals("") || jtfCelular.getText().equals("") || jcbTrabajo.getSelectedItem().equals("")){
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
                String email = jtfEmail1.getText();
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
            jcbPatologia.setVisible(true);
        }   
    }//GEN-LAST:event_jcxSiActionPerformed

    private void jcxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcxNoActionPerformed
        if(jcxNo.isSelected()){
            jcxSi.setSelected(false);
            jLCuantas.setVisible(false);
            jcbPatologia.setVisible(false);

        }
    }//GEN-LAST:event_jcxNoActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfAltura.setText("");
        jtfCelular.setText("");
        jtfDNI.setText("");
        jtfEmail1.setText("");
        jtfPeso.setText("");
        jtfBuscarDNI.setText("");
        jcxNo.setSelected(false);
        jcxSi.setSelected(false);
        jcxYes.setSelected(false);
        jcxNoB.setSelected(false);
        jcbPatologia.setVisible(false);
        
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmail1ActionPerformed

    }//GEN-LAST:event_jtfEmail1ActionPerformed

    private void jtfEmail1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmail1FocusLost
       String nousar1 = "@";
        String nousar2 = ".com";
        if(!jtfEmail1.getText().contains(nousar1) || !jtfEmail1.getText().contains(nousar2)){
            JOptionPane.showMessageDialog(this, "El email debe contener '@' o '.com'");
    }
    }//GEN-LAST:event_jtfEmail1FocusLost

    private void jcbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDepartamentoActionPerformed
        switch((String)jcbDepartamento.getSelectedItem()){
            case "Pueyrredón":
                jcbCiudad.removeAllItems();
                for(String j:depPuey){
               jcbCiudad.addItem(j);
                }
                break;
            case "Belgrano":
                jcbCiudad.removeAllItems();
                for(String b:depBel){
                    jcbCiudad.addItem(b);
                }
                break;
            case "Ayacucho":
                jcbCiudad.removeAllItems();
                for(String a:depAya){
                    jcbCiudad.addItem(a);
                }
                break;
            case "Chacabuco":
                jcbCiudad.removeAllItems();
                for(String c:depCha){
                    jcbCiudad.addItem(c);
                }
                break;
            case "Coronel Pringles":
                jcbCiudad.removeAllItems();
                for(String cp:depPrin){
                    jcbCiudad.addItem(cp);
                }
                break;
            case "Coronel Pedernera":
                jcbCiudad.removeAllItems();
                for(String cs:depPrin){
                    jcbCiudad.addItem(cs);
                }
                break;
            case "Gobernador Dupuy":
                jcbCiudad.removeAllItems();
                for(String d:depDup){
                    jcbCiudad.addItem(d);
                }
                break;
            case "Junín":
                jcbCiudad.removeAllItems();
                for(String j:depJuj){
                    jcbCiudad.addItem(j);
                }
                break;
            case "Libertador General San Martín":
                jcbCiudad.removeAllItems();
                for(String san:depMart){
                    jcbCiudad.addItem(san);
                }
        }
    }//GEN-LAST:event_jcbDepartamentoActionPerformed

    private void jcxYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcxYesActionPerformed
        jcxNoB.setSelected(false);
        jlDNI.setVisible(true);
        jtfBuscarDNI.setVisible(true);
        jbBuscar.setEnabled(true);
        jBEnviar.setEnabled(false);
    }//GEN-LAST:event_jcxYesActionPerformed

    private void jcxNoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcxNoBActionPerformed
        jcxYes.setSelected(false);
        jlDNI.setVisible(false);
        jtfBuscarDNI.setVisible(false);
        jbBuscar.setEnabled(false);
        jBEnviar.setEnabled(true);
                                     
    }//GEN-LAST:event_jcxNoBActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Long dni = Long.parseLong(jtfBuscarDNI.getText());
        Persona p = pd.buscarPersonaDni(dni);
        jtfNombre.setText(p.getNombre());
        jtfApellido.setText(p.getApellido());
        jtfDNI.setText(String.valueOf(p.getDni()));
        jtfAltura.setText(String.valueOf(p.getAltura()));
        jtfPeso.setText(String.valueOf(p.getPeso()));
        jdcFecha.setDate(java.sql.Date.valueOf(p.getFechaNac()));
        jtfEmail1.setText(p.getEmail());
        jtfCelular.setText(String.valueOf(p.getCelular()));
        if(p.getPatologia() != null){
            jcxSi.setSelected(true);
            jcbPatologia.setVisible(true);
            jcbPatologia.setSelectedItem(p.getPatologia());
            jcbPatologia.setEnabled(false);
        }
        jcbDepartamento.setSelectedItem(p.getDepartamento());
        jcbCiudad.setSelectedItem(p.getCiudad());
        jcbTrabajo.setSelectedItem(p.getTrabajo());
        
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLCuantas;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLDepartamento;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPeso;
    private javax.swing.JLabel jLSufre;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbCiudad;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JComboBox<Patologia> jcbPatologia;
    private javax.swing.JComboBox<String> jcbTrabajo;
    private javax.swing.JCheckBox jcxNo;
    private javax.swing.JCheckBox jcxNoB;
    private javax.swing.JCheckBox jcxSi;
    private javax.swing.JCheckBox jcxYes;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlError2;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfBuscarDNI;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfEmail1;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
