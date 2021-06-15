/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunargp4.control.*;
import vacunargp4.modelo.*;

/**
 *
 * @author kevin
 */
public class ViewCrearCita extends javax.swing.JInternalFrame {
    
    CitaVacunacionData cvd;
    DosisData dd;
    VacunatorioData vd;
    PersonaData pd;
    private DefaultTableModel tabla;
    private Persona personaElegida;

    /**
     * Creates new form ViewCrearCita
     */
    public ViewCrearCita(CitaVacunacionData cvd, DosisData dd, VacunatorioData vd, PersonaData pd) {
        initComponents();
        this.cvd = cvd;
        this.dd = dd;
        this.vd = vd;
        this.pd = pd;
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        armarCabecera();
        llenarTabla();
        jdcFecha.setDate(Date.valueOf(LocalDate.now()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLTitleVacunatorio = new javax.swing.JLabel();
        jLDepartamento = new javax.swing.JLabel();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jLCiudad = new javax.swing.JLabel();
        jcbCiudad = new javax.swing.JComboBox<>();
        jLVacunatorio = new javax.swing.JLabel();
        jcbVacunatorio = new javax.swing.JComboBox<>();
        jLSelAuto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLTitleFecha = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLHora = new javax.swing.JLabel();
        jSliderHora = new javax.swing.JSlider();
        jLHoraShow = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLTitleEst = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jLCantDosis = new javax.swing.JLabel();
        jcbCantDosis = new javax.swing.JComboBox<>();
        jBCrear = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jLabel1.setText("CREAR CITA DE VACUNACION");

        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePersonas);

        jLTitleVacunatorio.setText("VACUNATORIO");

        jLDepartamento.setText("DEPARTAMENTO:");

        jcbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ayacucho", "Belgrano", "Chacabuco", "Coronel Pringles", "General Pedernera", "Gobernador Dupuy", "Junín", "Pueyrredón", "Libertador General San Martín" }));
        jcbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDepartamentoActionPerformed(evt);
            }
        });

        jLCiudad.setText("CIUDAD:");

        jcbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiudadActionPerformed(evt);
            }
        });

        jLVacunatorio.setText("VACUNATORIO:");

        jLSelAuto.setText("(Selección automática)");

        jLTitleFecha.setText("FECHA Y HORA");

        jLFecha.setText("FECHA:");

        jdcFecha.setMaxSelectableDate(new java.util.Date(1672527600000L));
        jdcFecha.setMinSelectableDate(new java.util.Date(1609498800000L));

        jLHora.setText("HORA:");

        jSliderHora.setMajorTickSpacing(1);
        jSliderHora.setMaximum(20);
        jSliderHora.setMinimum(8);
        jSliderHora.setPaintLabels(true);
        jSliderHora.setValue(9);
        jSliderHora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderHoraStateChanged(evt);
            }
        });

        jLHoraShow.setText("8:00");

        jLTitleEst.setText("ESTADO");

        jLEstado.setText("ESTADO DE CITA:");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espera" }));
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });

        jLCantDosis.setText("DOSIS:");

        jcbCantDosis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Primera", "Segunda" }));

        jBCrear.setText("CREAR");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });

        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitleEst)
                .addGap(433, 433, 433))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLDepartamento)
                                    .addComponent(jLCiudad)
                                    .addComponent(jLVacunatorio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbDepartamento, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jcbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbVacunatorio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addComponent(jLSelAuto)
                                .addGap(216, 216, 216))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(377, 377, 377))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLTitleVacunatorio)
                                .addGap(415, 415, 415))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLTitleFecha)
                                .addGap(413, 413, 413))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLFecha)
                                .addGap(58, 58, 58)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLHora)
                                .addGap(18, 18, 18)
                                .addComponent(jLHoraShow, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderHora, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLEstado)
                .addGap(18, 18, 18)
                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLCantDosis)
                .addGap(18, 18, 18)
                .addComponent(jcbCantDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jBCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpiar)
                .addGap(167, 167, 167)
                .addComponent(jBSalir)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitleVacunatorio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDepartamento)
                    .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCiudad)
                    .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVacunatorio)
                    .addComponent(jcbVacunatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSelAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitleFecha)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLHora)
                            .addComponent(jLHoraShow))
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLFecha))
                    .addComponent(jSliderHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitleEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(jLCantDosis)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCantDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCrear)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDepartamentoActionPerformed
        // TODO add your handling code here:
        jcbCiudad.removeAllItems();
        switch(jcbDepartamento.getSelectedItem().toString()){
            case "Pueyrredón":{
                jcbCiudad.addItem("San Luis (capital provincial)");
                jcbCiudad.addItem("Alto Pencoso");
                jcbCiudad.addItem("Balde");
                jcbCiudad.addItem("Beazley");
                jcbCiudad.addItem("Cazador");
                jcbCiudad.addItem("Chosmes");
                jcbCiudad.addItem("Desaguadero");
                jcbCiudad.addItem("El Volcán");
                jcbCiudad.addItem("Jarilla");
                jcbCiudad.addItem("Juana Koslay");
                jcbCiudad.addItem("La Punta");
                jcbCiudad.addItem("Mosmota");
                jcbCiudad.addItem("Potrero de los Funes");
                jcbCiudad.addItem("Salinas del Bebedero");
                jcbCiudad.addItem("San Gerónimo");
                jcbCiudad.addItem("Desaguadero");
                jcbCiudad.addItem("Zanjitas");
                break;
            }
            case "Belgrano":{
                jcbCiudad.addItem("La Calera ");
                jcbCiudad.addItem("Nogolí ");
                jcbCiudad.addItem("Villa de la Quebrada ");
                jcbCiudad.addItem("Villa General Roca");
                break;
            }
            case "Ayacucho":{
                jcbCiudad.addItem("Candelaria");
                jcbCiudad.addItem("La Majada");
                jcbCiudad.addItem("Leandro N. Alem");
                jcbCiudad.addItem("Luján");
                jcbCiudad.addItem("Quines");
                jcbCiudad.addItem("Río Juan Gómez");
                jcbCiudad.addItem("San Francisco del Monte de Oro");
                break;
            }
            case "Chacabuco":{
                jcbCiudad.addItem("Concarán");
                jcbCiudad.addItem("Cortaderas");
                jcbCiudad.addItem("Naschel");
                jcbCiudad.addItem("Papagayos");
                jcbCiudad.addItem("Renca");
                jcbCiudad.addItem("San Pablo");
                jcbCiudad.addItem("Tilisarao");
                jcbCiudad.addItem("Villa del Carmen");
                jcbCiudad.addItem("Villa Larca");
                break;
            }
            case "Coronel Pringles":{
                jcbCiudad.addItem("Carolina");
                jcbCiudad.addItem("El Trapiche");
                jcbCiudad.addItem("Fraga");
                jcbCiudad.addItem("La Bajada");
                jcbCiudad.addItem("La Florida");
                jcbCiudad.addItem("La Toma");
                jcbCiudad.addItem("Riocito");
                jcbCiudad.addItem("Saladillo");
                jcbCiudad.addItem("Estancia Grande");
                break;
            }
            case "General Pedernera":{
                jcbCiudad.addItem("Juan Jorba");
                jcbCiudad.addItem("Juan Llerena");
                jcbCiudad.addItem("Justo Daract");
                jcbCiudad.addItem("La Esquina");
                jcbCiudad.addItem("La Punilla");
                jcbCiudad.addItem("Lavaisse");
                jcbCiudad.addItem("San José del Morro");
                jcbCiudad.addItem("Villa Mercedes");
                break;
            }
            case "Gobernador Dupuy":{
                jcbCiudad.addItem("Anchorena");
                jcbCiudad.addItem("Arizona");
                jcbCiudad.addItem("Bagual");
                jcbCiudad.addItem("Batavia");
                jcbCiudad.addItem("Buena Esperanza");
                jcbCiudad.addItem("Fortín El Patria");
                jcbCiudad.addItem("Fortuna");
                jcbCiudad.addItem("La Maroma");
                jcbCiudad.addItem("Martín de Loyola");
                jcbCiudad.addItem("Nahuel Mapá");
                jcbCiudad.addItem("Navia");
                jcbCiudad.addItem("Nueva Galia");
                jcbCiudad.addItem("Unión");
                break;
            }
            case "Junín":{
                jcbCiudad.addItem("Carpintería");
                jcbCiudad.addItem("Cerro de Oro");
                jcbCiudad.addItem("Lafinur");
                jcbCiudad.addItem("Los Cajones");
                jcbCiudad.addItem("Los Molles");
                jcbCiudad.addItem("Merlo");
                jcbCiudad.addItem("Santa Rosa de Conlara");
                jcbCiudad.addItem("Talita");
                break;
            }
            case "Libertador General San Martín":{
                jcbCiudad.addItem("Las Aguadas");
                jcbCiudad.addItem("Las Chacras");
                jcbCiudad.addItem("Las Lagunas");
                jcbCiudad.addItem("Las Vertientes");
                jcbCiudad.addItem("Paso Grande");
                jcbCiudad.addItem("San Martín");
                jcbCiudad.addItem("Villa de Praga");
                break;
            }
        }
        llenarVacunatoriosDep(jcbDepartamento.getSelectedItem().toString());
    }//GEN-LAST:event_jcbDepartamentoActionPerformed

    private void jcbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCiudadActionPerformed

    private void jTablePersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePersonasMouseClicked
        // TODO add your handling code here:
        int filaSel = jTablePersonas.getSelectedRow();
        
        if(filaSel != -1){
            personaElegida = new Persona();
            personaElegida.setIdPersona((Integer)jTablePersonas.getValueAt(filaSel, 0));
            personaElegida.setDni((Long)jTablePersonas.getValueAt(filaSel, 1));
            personaElegida.setPatologia((Patologia)jTablePersonas.getValueAt(filaSel, 2));
            personaElegida.setNombre((String)jTablePersonas.getValueAt(filaSel, 3));
            personaElegida.setApellido((String)jTablePersonas.getValueAt(filaSel, 4));
            personaElegida.setAltura((Double)jTablePersonas.getValueAt(filaSel, 5));
            personaElegida.setPeso((Double)jTablePersonas.getValueAt(filaSel, 6));
            personaElegida.setFechaNac((LocalDate)jTablePersonas.getValueAt(filaSel, 7));
            personaElegida.setCelular((Long)jTablePersonas.getValueAt(filaSel, 8));
            personaElegida.setEmail((String)jTablePersonas.getValueAt(filaSel, 9));
            personaElegida.setTrabajo((String)jTablePersonas.getValueAt(filaSel, 10));
            personaElegida.setDepartamento((String)jTablePersonas.getValueAt(filaSel, 11));
            personaElegida.setCiudad((String)jTablePersonas.getValueAt(filaSel, 12));
            personaElegida.setActivo((Boolean)jTablePersonas.getValueAt(filaSel, 13));
            
            jcbDepartamento.setSelectedItem((String)jTablePersonas.getValueAt(filaSel, 11));
            jcbCiudad.setSelectedItem((String)jTablePersonas.getValueAt(filaSel, 12));
            jcbCantDosis.setSelectedItem(cvd.cualCorresponde((Integer)jTablePersonas.getValueAt(filaSel, 0)));
        }
    }//GEN-LAST:event_jTablePersonasMouseClicked

    private void jSliderHoraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderHoraStateChanged
        // TODO add your handling code here:
        jLHoraShow.setText(jSliderHora.getValue()+":00");
    }//GEN-LAST:event_jSliderHoraStateChanged

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jcbDepartamento.setSelectedItem(null);
        jcbCiudad.setSelectedItem(null);
        jcbVacunatorio.setSelectedItem(null);
        jdcFecha.setDate(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        if(jcbDepartamento.getSelectedItem() == null || jcbCiudad.getSelectedItem() == null || jdcFecha.getDate() == null){
            JOptionPane.showMessageDialog(this, "Hay campos sin completar");
        }
    }//GEN-LAST:event_jBCrearActionPerformed
    
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("DNI");
        columnas.add("PATOLOGIA");
        columnas.add("NOMBRE");
        columnas.add("APELLIDO");
        columnas.add("ALTURA");
        columnas.add("PESO");
        columnas.add("FECHA-NAC");
        columnas.add("CELULAR");
        columnas.add("EMAIL");
        columnas.add("TRABAJO");
        columnas.add("DEPARTAMENTO");
        columnas.add("CIUDAD");
        columnas.add("ESTADO");
        for(Object it:columnas){
            tabla.addColumn(it);
        }
        jTablePersonas.setModel(tabla);
    }
    
    private void llenarTabla(){
        borrarFilas();
        for(Persona a:pd.traerTodoPersonaParaCitas()){
            tabla.addRow(new Object[]{a.getIdPersona(), a.getDni(), a.getPatologia(), a.getNombre(), a.getApellido(), a.getAltura(), a.getPeso(), a.getFechaNac(),a.getCelular(), a.getEmail(), a.getTrabajo(), a.getDepartamento(), a.getCiudad(), a.isActivo()});
        }
    }
    
    private void borrarFilas(){
        int a = tabla.getRowCount()-1;
        for(int i = a; i>=0; i--){
            tabla.removeRow(i);
        }
    }
    
    private void llenarVacunatoriosDep(String a){
        jcbVacunatorio.removeAllItems();
        for(Vacunatorio v:vd.traerTodoVacunatorioDep(a)){
            jcbVacunatorio.addItem(v);
        }
    }
    
    private void llenarVacunatoriosCiudad(String b){
        jcbVacunatorio.removeAllItems();
        for(Vacunatorio v:vd.traerTodoVacunatorioCiudad(b)){
            jcbVacunatorio.addItem(v);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLCantDosis;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLDepartamento;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLHoraShow;
    private javax.swing.JLabel jLSelAuto;
    private javax.swing.JLabel jLTitleEst;
    private javax.swing.JLabel jLTitleFecha;
    private javax.swing.JLabel jLTitleVacunatorio;
    private javax.swing.JLabel jLVacunatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSlider jSliderHora;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JComboBox<String> jcbCantDosis;
    private javax.swing.JComboBox<String> jcbCiudad;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<Vacunatorio> jcbVacunatorio;
    private com.toedter.calendar.JDateChooser jdcFecha;
    // End of variables declaration//GEN-END:variables
}
