/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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
public class CitaVacunacionData {
    Connection con;
    PersonaData pd;
    VacunatorioData vd;
    DosisData dd;

    public CitaVacunacionData(Conexion conexion) {
        con = conexion.getConnection();
        pd = new PersonaData(conexion);
        vd = new VacunatorioData(conexion);
        dd = new DosisData(conexion);
    }
    
    public void crearCitaVacunacion(CitaVacunacion cv){
        try {
            String sql = "INSERT INTO cita_vacunacion(idPersona, idVacunatorio, fecha, hora, estado, cant_Dosis) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cv.getPersona().getIdPersona());
            ps.setInt(2, cv.getVacunatorio().getIdVacunatorio());
            ps.setDate(3, Date.valueOf(cv.getFecha()));
            ps.setTime(4, Time.valueOf(cv.getHora()));
            ps.setString(5, cv.getEstado());
            ps.setString(6, cv.getCantDosis());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                cv.setIdCita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La cita de vacunacion se creo correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo crear la cita de vacunacion");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la cita de vacunacion");
        }
    }
    
    public void updateCita(CitaVacunacion cv){
        try {
            String sql = "UPDATE cita_vacunacion SET idPersona=?,idVacunatorio=?,idDosis=?,fecha=?,hora=?,estado=?,cant_Dosis=? WHERE idCita = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cv.getPersona().getIdPersona());
            ps.setInt(2, cv.getVacunatorio().getIdVacunatorio());
            ps.setInt(3, cv.getDosis().getIdDosis());
            ps.setDate(4, Date.valueOf(cv.getFecha()));
            ps.setTime(5, Time.valueOf(cv.getHora()));
            ps.setString(6, cv.getEstado());
            ps.setString(7, cv.getCantDosis());
            ps.setInt(8, cv.getIdCita());
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente la cita");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la cita");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la cita");
        }
    }
    
    public CitaVacunacion buscarCitaVacunacionId(int id){
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE idCita = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la cita de vacunacion");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return cv;
    }
    
    public List<CitaVacunacion> traerCitaVacunacionIdPersona(int id){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerCitaVacunacionIdVacunatorio(int id){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE idVacunatorio = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerCitaVacunacionFecha(LocalDate fecha){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerCitaVacunacionHora(LocalTime hora){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setTime(1, Time.valueOf(hora));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerCitaVacunacionEstado(String estado){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE estado = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, estado);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerCitaVacunacionCantDosis(String can){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion WHERE cant_Dosis = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, can);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerTodoCitaVacunacion(){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                System.out.println(rs.getInt(4));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public String cualCorresponde(int id){
        String cual = "Primera";
        for(CitaVacunacion cv:traerCitaVacunacionIdPersona(id)){
            switch(cv.getCantDosis()){
                case "Primera":{
                    if(cv.getEstado() == "Cumplida"){
                        cual = "Segunda";
                    }else{
                        cual = "Primera";
                    }
                    break;
                }
                case "Segunda":{
                    if(cv.getCantDosis() == "Cumplida"){
                        cual = "Ninguna";
                    }else{
                        cual = "Segunda";
                    }
                }
            }
        }
        return cual;
    }
    
    public List<CitaVacunacion> traerCitaEsperaFecha(LocalDate fecha){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion c WHERE c.estado = 'Espera' AND c.fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public List<CitaVacunacion> traerCitaEspera(){
        List<CitaVacunacion> citas = new ArrayList<>();
        CitaVacunacion cv = null;
        try {
            String sql = "SELECT * FROM cita_vacunacion c WHERE c.estado = 'Espera'";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cv = new CitaVacunacion();
                cv.setIdCita(rs.getInt(1));
                cv.setPersona(pd.buscarPersonaId(rs.getInt(2)));
                cv.setVacunatorio(vd.buscarVacunatorioId(rs.getInt(3)));
                cv.setDosis(dd.buscarDosisId(rs.getInt(4)));
                cv.setFecha(LocalDate.parse(String.valueOf(rs.getDate(5))));
                cv.setHora(LocalTime.parse(String.valueOf(rs.getTime(6))));
                cv.setEstado(rs.getString(7));
                cv.setCantDosis(rs.getString(8));
                citas.add(cv);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cita de vacunacion");
        }
        return citas;
    }
    
    public void actualizarCitaSinDosis(int id, String estado){
        try {
            String sql = "UPDATE cita_vacunacion SET estado = ? WHERE idCita = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, estado);
            ps.setInt(2, id);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la cita");
        }
    }
    
    public void actualizarCitaConDosis(int id, Dosis d){
        try {
            String sql = "UPDATE cita_vacunacion SET estado = 'Cumplida' ,idDosis = ? WHERE idCita = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, d.getIdDosis());
            ps.setInt(2, id);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la cita");
        }
    }
}
