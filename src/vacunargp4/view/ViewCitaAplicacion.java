/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import vacunargp4.control.*;
import vacunargp4.modelo.*;

/**
 *
 * @author kevin
 */
public class ViewCitaAplicacion extends javax.swing.JInternalFrame {
    
    CitaVacunacionData cvd;
    private DefaultTableModel tabla;
    private CitaVacunacion citaElegida;
    

    /**
     * Creates new form ViewCitaAplicacion
     */
    public ViewCitaAplicacion(CitaVacunacionData cvd) {
        initComponents();
        this.cvd = cvd;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCitas = new javax.swing.JTable();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbBuscarFecha = new javax.swing.JButton();

        jLabel1.setText("CITA - APLICAR DOSIS");

        jTableCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCitas);

        jbBuscarFecha.setText("BUSCAR");
        jbBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarFecha)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarFecha))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 279, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarFechaActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(jdcFecha.getDate());
        LocalDate fechaCita = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        llenarTablaFecha(fechaCita);
    }//GEN-LAST:event_jbBuscarFechaActionPerformed

    
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("PERSONA");
        columnas.add("VACUNATORIO");
        columnas.add("DOSIS");
        columnas.add("FECHA");
        columnas.add("HORA");
        columnas.add("ESTADO");
        columnas.add("CANT-DOSIS");
        for(Object it:columnas){
            tabla.addColumn(it);
        }
        jTableCitas.setModel(tabla);
    }
    
    private void llenarTabla(){
        borrarFilas();
        for(CitaVacunacion a:cvd.traerCitaEspera()){
            tabla.addRow(new Object[]{a.getIdCita(), a.getPersona(), a.getVacunatorio(), a.getDosis(), a.getFecha(), a.getHora(), a.getEstado(), a.getCantDosis()});
        }
    }
    
    private void llenarTablaFecha(LocalDate fecha){
        borrarFilas();
        for(CitaVacunacion a:cvd.traerCitaEsperaFecha(fecha)){
            tabla.addRow(new Object[]{a.getIdCita(), a.getPersona(), a.getVacunatorio(), a.getDosis(), a.getFecha(), a.getHora(), a.getEstado(), a.getCantDosis()});
        }
    }
    
    private void borrarFilas(){
        int a = tabla.getRowCount()-1;
        for(int i = a; i>=0; i--){
            tabla.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCitas;
    private javax.swing.JButton jbBuscarFecha;
    private com.toedter.calendar.JDateChooser jdcFecha;
    // End of variables declaration//GEN-END:variables
}
