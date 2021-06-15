/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunargp4.control.*;
import vacunargp4.modelo.*;


/**
 *
 * @author bebo_
 */
public class ViewDosis extends javax.swing.JInternalFrame {
    DosisData dd;
    LaboratorioData ld;
    private DefaultTableModel tabla;
    
    public ViewDosis(DosisData dd, LaboratorioData ld) {
        initComponents();
        this.dd = dd;
        this.ld = ld;
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        armarCabecera();
        llenarTabla();
        llenarLab();
        jtNumSerie.setText(String.valueOf(dd.maxNumSerie()));
    }
    private void llenarLab(){
        for(Laboratorio x:ld.traerTodoLaboratorio()){
            jcbLab.addItem(x);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNumSerie = new javax.swing.JTextField();
        jcbLab = new javax.swing.JComboBox<>();
        jbRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDosis = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtCantidad = new javax.swing.JTextField();

        jLabel1.setText("Laboratorio:");

        jLabel2.setText("Gestion Dosis vacunAr");

        jLabel3.setText("Num. Serie (desde):");

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jTableDosis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDosis);

        jLabel4.setText("Cantidad de dosis:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNumSerie)
                            .addComponent(jcbLab, 0, 206, Short.MAX_VALUE)
                            .addComponent(jtCantidad))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(0, 313, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegistrar)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if(jtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Complete los campos");
        }else{
        
        try {
            Laboratorio lab = (Laboratorio)jcbLab.getSelectedItem();
            int nSerie = Integer.parseInt(jtNumSerie.getText());
            int cant = Integer.parseInt(jtCantidad.getText());

            for(int i = 1; i<=cant; i++){
                Dosis d = new Dosis(lab, nSerie+i);
                dd.crearDosis(d);
            }
            llenarTabla();
            jtNumSerie.setText(String.valueOf(dd.maxNumSerie()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros.");
        }
            }
    }//GEN-LAST:event_jbRegistrarActionPerformed
    
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("IDDOSIS");
        columnas.add("LABORATORIO");
        columnas.add("NUM-SERIE");
        columnas.add("ESTADO");
        for(Object it:columnas){
            tabla.addColumn(it);
        }
        jTableDosis.setModel(tabla);
    }
    
    private void llenarTabla(){
        borrarFilas();
        for(Dosis a:dd.traerTodoDosis()){
            tabla.addRow(new Object[]{a.getIdDosis(), a.getLab().getNombre(), a.getNumSerie(), a.isEstado()});
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDosis;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<Laboratorio> jcbLab;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtNumSerie;
    // End of variables declaration//GEN-END:variables
}