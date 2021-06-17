/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunargp4.modelo.*;
import vacunargp4.control.*;

/**
 *
 * @author bebo_
 */
public class viewCentroVacunacion extends javax.swing.JInternalFrame {
    VacunatorioData vd;
    private DefaultTableModel tabla;
    
    
    public viewCentroVacunacion(VacunatorioData vd) {
        initComponents();
        this.vd = vd;
        tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        armarCabecera();
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jcbCiudad = new javax.swing.JComboBox<>();
        jbRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVacunatorio = new javax.swing.JTable();

        jLabel1.setText("Centro de Vacunacion vacunAr 2001");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Departamento:");

        jLabel4.setText("Ciudad:");

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jcbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ayacucho", "Belgrano", "Chacabuco", "Coronel Pringles", "General Pedernera", "Gobernador Dupuy", "Junín", "Pueyrredón", "Libertador General San Martín" }));
        jcbDepartamento.setToolTipText("");
        jcbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDepartamentoActionPerformed(evt);
            }
        });

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jTableVacunatorio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableVacunatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVacunatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVacunatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbRegistrar)
                                .addGap(150, 150, 150))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(54, 54, 54)
                                    .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jcbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jcbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDepartamentoActionPerformed
        jcbCiudad.removeAllItems();
        switch((String)jcbDepartamento.getSelectedItem()){
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
            case "Coronel Pedernera":{
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
    }//GEN-LAST:event_jcbDepartamentoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if(jtfNombre.getText().equals("") || jcbDepartamento.getSelectedItem() == null || jcbCiudad.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
        } else{
            String ciudad = (String)jcbCiudad.getSelectedItem();
        String dep = (String)jcbDepartamento.getSelectedItem();
        String nombre = jtfNombre.getText();
        Vacunatorio vac = new Vacunatorio(nombre, dep, nombre);
        vd.crearVacunatorio(vac);
        llenarTabla();
        } 
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jTableVacunatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVacunatorioMouseClicked
       
        
    }//GEN-LAST:event_jTableVacunatorioMouseClicked
    
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("IDVACUNATORIO");
        columnas.add("NOMBRE");
        columnas.add("DEPARTAMENTO");
        columnas.add("CIUDAD");
        for(Object it:columnas){
            tabla.addColumn(it);
        }
        jTableVacunatorio.setModel(tabla);
    }
    
    private void llenarTabla(){
        borrarFilas();
        for(Vacunatorio a:vd.traerTodoVacunatorio()){
            tabla.addRow(new Object[]{a.getIdVacunatorio(), a.getNombre(), a.getDepartamento(), a.getCiudad()});
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
    private javax.swing.JTable jTableVacunatorio;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcbCiudad;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
