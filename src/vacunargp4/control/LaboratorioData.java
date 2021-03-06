/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vacunargp4.modelo.*;

/**
 *
 * @author kevin
 */
public class LaboratorioData {
    Connection con;

    public LaboratorioData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
    public void crearLaboratorio(Laboratorio lab){
        if(!verificar(lab)){
            try {
                String sql = "INSERT INTO laboratorio(nombre, direccion, paisOrigen) VALUES (?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, lab.getNombre());
                ps.setString(2, lab.getDireccion());
                ps.setString(3, lab.getPaisOrigen());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    lab.setIdLaboratorio(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Laboratorio registrado satisfactoriamente.");
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al crear el laboratorio");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No puede crear un laboratorio con el mismo nombre");
        }
    }
    
    public Laboratorio buscarLaboratorioId(int id){
        Laboratorio lab = null;
        try {
            String sql = "SELECT * FROM laboratorio WHERE idLaboratorio = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                lab = new Laboratorio();
                lab.setIdLaboratorio(rs.getInt(1));
                lab.setNombre(rs.getString(2));
                lab.setDireccion(rs.getString(3));
                lab.setPaisOrigen(rs.getString(4));
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el laboratorio");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el laboratorio");
        }
        return lab;
    }
    
    public List<Laboratorio> traerTodoLaboratorio(){
        List<Laboratorio> labs = new ArrayList<>();
        Laboratorio lab = null;
        try {
            String sql = "SELECT * FROM laboratorio";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lab = new Laboratorio();
                lab.setIdLaboratorio(rs.getInt(1));
                lab.setNombre(rs.getString(2));
                lab.setDireccion(rs.getString(3));
                lab.setPaisOrigen(rs.getString(4));
                labs.add(lab);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al traer todos los laboratorios");
        }
        return labs;
    }
    
    private boolean verificar(Laboratorio a){
        boolean e = false;
        for(Laboratorio l:traerTodoLaboratorio()){
            if(l.equals(a)){
                e = true;
                break;
            }
        }
        return e;
    }
    
    public void ActualizarLab(Laboratorio lab){
        try {
            String sql = "UPDATE laboratorio SET nombre = ?, direccion = ?, paisOrigen = ? WHERE idLaboratorio = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lab.getNombre());
            ps.setString(2, lab.getDireccion());
            ps.setString(3, lab.getPaisOrigen());
            ps.setInt(4, lab.getIdLaboratorio());
            
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar laboratorio");
        }
    }
}
