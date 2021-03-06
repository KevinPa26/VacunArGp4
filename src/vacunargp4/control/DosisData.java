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
public class DosisData {
    Connection con;
    LaboratorioData ld;

    public DosisData(Conexion conexion) {
        con = conexion.getConnection();
        ld = new LaboratorioData(conexion);
    }
    
    public void crearDosis(Dosis dosis){
        try {
            String sql = "INSERT INTO dosis(idLaboratorio, numSerie, estado) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dosis.getLab().getIdLaboratorio());
            ps.setInt(2, dosis.getNumSerie());
            ps.setBoolean(3, dosis.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                dosis.setIdDosis(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La dosis se creo correctamente");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la dosis");
        }
    }
    
    public Dosis buscarDosisId(int id){
        Dosis dosis = null;
        try {
            String sql = "SELECT * FROM dosis WHERE idDosis = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                dosis = new Dosis();
                dosis.setIdDosis(rs.getInt(1));
                dosis.setLab(ld.buscarLaboratorioId(rs.getInt(2)));
                dosis.setNumSerie(rs.getInt(3));
                dosis.setEstado(rs.getBoolean(4));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la dosis");
        }
        return dosis;
    }
    
    public Dosis buscarDosisNumSerie(int num){
        Dosis dosis = null;
        try {
            String sql = "SELECT * FROM dosis WHERE numSerie = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, num);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                dosis = new Dosis();
                dosis.setIdDosis(rs.getInt(1));
                dosis.setLab(ld.buscarLaboratorioId(rs.getInt(2)));
                dosis.setNumSerie(rs.getInt(3));
                dosis.setEstado(rs.getBoolean(4));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la dosis");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la dosis");
        }
        return dosis;
    }
    
    public List<Dosis> traerDosisIdLaboratorio(int id){
        List<Dosis> ldosis = new ArrayList<>();
        Dosis dosis = null;
        try {
            String sql = "SELECT * FROM dosis WHERE idLaboratorio = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dosis = new Dosis();
                dosis.setIdDosis(rs.getInt(1));
                dosis.setLab(ld.buscarLaboratorioId(rs.getInt(2)));
                dosis.setNumSerie(rs.getInt(3));
                dosis.setEstado(rs.getBoolean(4));
                ldosis.add(dosis);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar las dosis");
        }
        return ldosis;
    }
    
    public List<Dosis> traerDosisEstado(boolean estado){
        List<Dosis> ldosis = new ArrayList<>();
        Dosis dosis = null;
        try {
            String sql = "SELECT * FROM dosis WHERE estado = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dosis = new Dosis();
                dosis.setIdDosis(rs.getInt(1));
                dosis.setLab(ld.buscarLaboratorioId(rs.getInt(2)));
                dosis.setNumSerie(rs.getInt(3));
                dosis.setEstado(rs.getBoolean(4));
                ldosis.add(dosis);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar las dosis");
        }
        return ldosis;
    }
    
    public List<Dosis> traerTodoDosis(){
        List<Dosis> ldosis = new ArrayList<>();
        Dosis dosis = null;
        try {
            String sql = "SELECT * FROM dosis";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dosis = new Dosis();
                dosis.setIdDosis(rs.getInt(1));
                dosis.setLab(ld.buscarLaboratorioId(rs.getInt(2)));
                dosis.setNumSerie(rs.getInt(3));
                dosis.setEstado(rs.getBoolean(4));
                ldosis.add(dosis);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al traer las dosis");
        }
        return ldosis;
    }

    public int maxNumSerie(){
        int a = 0;
        try {
            String sql = "SELECT MAX(numSerie) FROM dosis";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                a = rs.getInt(1);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DosisData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public void bajaDosis(int id){
        try {
            String sql = "UPDATE dosis SET estado = false WHERE idDosis = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DosisData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
