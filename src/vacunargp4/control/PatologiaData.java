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
public class PatologiaData {
    Connection con;

    public PatologiaData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
    public void crearPatologia(Patologia pato){
        if(!verificar(pato)){
            try {
                String sql = "INSERT INTO patologia(nombre) VALUES (?)";
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, pato.getNombre());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    pato.setIdPatologia(rs.getInt(1));
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al crear la patologia");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No puede crear una patologia que este en la base de datos");
        }
    }
    
    public Patologia buscarPatologiaId(int id){
        Patologia pato = null;
        try {
            String sql = "SELECT * FROM patologia WHERE idPatologia = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pato = new Patologia();
                pato.setIdPatologia(rs.getInt(1));
                pato.setNombre(rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la patologia");
        }
        return pato;
    }
    
    public Patologia buscarPatologiaNombre(String nom){
        Patologia pato = null;
        try {
            String sql = "SELECT * FROM patologia WHERE nombre = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pato = new Patologia();
                pato.setIdPatologia(rs.getInt(1));
                pato.setNombre(rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la patologia");
        }
        return pato;
    }
    
    public List<Patologia> traerTodoPatologia(){
        String sql = "SELECT * FROM patologia";
        List<Patologia> patos = new ArrayList<>();
        Patologia pato;
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                pato = new Patologia();
                pato.setIdPatologia(rs.getInt(1));
                pato.setNombre(rs.getString(2));
                patos.add(pato);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al traer todas las patologias");
        }
        return patos;
    }
    
    private boolean verificar(Patologia a){
        boolean e = false;
        for(Patologia i:traerTodoPatologia()){
            if(i.equals(a)){
                e = true;
                break;
            }
        }
        return e;
    }
}
