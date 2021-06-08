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
import java.time.LocalDate;
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
public class PersonaData {
    Connection con;
    PatologiaData paD;

    public PersonaData(Conexion conexion) {
        con = conexion.getConnection();
        paD = new PatologiaData(conexion);
    }
    
    public void crearPersonaSinPato(Persona persona){
        try {
            String sql = "INSERT INTO persona(dni, nombre, apellido, altura, peso, fechaNac, celular, email, trabajo, departamento, ciudad) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, persona.getDni());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setDouble(4, persona.getAltura());
            ps.setDouble(5, persona.getPeso());
            ps.setDate(6, Date.valueOf(persona.getFechaNac()));
            ps.setLong(7, persona.getCelular());
            ps.setString(8, persona.getEmail());
            ps.setString(9, persona.getTrabajo());
            ps.setString(10, persona.getDepartamento());
            ps.setString(11, persona.getCiudad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                persona.setIdPersona(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La persona se creo correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo crear la persona.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la persona.");
            System.out.println(ex.getMessage());
        }
    }
    
    public void crearPersonaConPato(Persona persona){
        try {
            String sql = "INSERT INTO persona(dni, idPatologia, nombre, apellido, altura, peso, fechaNac, celular, email, trabajo, departamento, ciudad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, persona.getDni());
            ps.setInt(2, persona.getPatologia().getIdPatologia());
            ps.setString(3, persona.getNombre());
            ps.setString(4, persona.getApellido());
            ps.setDouble(5, persona.getAltura());
            ps.setDouble(6, persona.getPeso());
            ps.setDate(7, Date.valueOf(persona.getFechaNac()));
            ps.setLong(8, persona.getCelular());
            ps.setString(9, persona.getEmail());
            ps.setString(10, persona.getTrabajo());
            ps.setString(11, persona.getDepartamento());
            ps.setString(12, persona.getCiudad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                persona.setIdPersona(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La persona se creo correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo crear la persona.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la persona.");
            System.out.println(ex.getMessage());
        }
    }
    
    public Persona buscarPersonaId(int id){
        Persona persona = null;
        try {
            String sql = "SELECT * FROM persona WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                persona = new Persona();
                persona.setIdPersona(rs.getInt(1));
                persona.setDni(rs.getLong(2));
                persona.setPatologia(paD.buscarPatologiaId(rs.getInt(3)));
                persona.setNombre(rs.getString(4));
                persona.setApellido(rs.getString(5));
                persona.setAltura(rs.getDouble(6));
                persona.setPeso(rs.getDouble(7));
                persona.setFechaNac(LocalDate.parse(String.valueOf(rs.getDate(8))));
                persona.setCelular(rs.getLong(9));
                persona.setEmail(rs.getString(10));
                persona.setTrabajo(rs.getString(11));
                persona.setDepartamento(rs.getString(12));
                persona.setCiudad(rs.getString(13));
            }else{
                JOptionPane.showConfirmDialog(null, "No se encontro la persona");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al buscar la persona");
        }
        return persona;
    }
    
    public Persona buscarPersonaDni(long dni){
        Persona persona = null;
        try {
            String sql = "SELECT * FROM persona WHERE dni = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                persona = new Persona();
                persona.setIdPersona(rs.getInt(1));
                persona.setDni(rs.getLong(2));
                persona.setPatologia(paD.buscarPatologiaId(rs.getInt(3)));
                persona.setNombre(rs.getString(4));
                persona.setApellido(rs.getString(5));
                persona.setAltura(rs.getDouble(6));
                persona.setPeso(rs.getDouble(7));
                persona.setFechaNac(LocalDate.parse(String.valueOf(rs.getDate(8))));
                persona.setCelular(rs.getLong(9));
                persona.setEmail(rs.getString(10));
                persona.setTrabajo(rs.getString(11));
                persona.setDepartamento(rs.getString(12));
                persona.setCiudad(rs.getString(13));
            }else{
                JOptionPane.showConfirmDialog(null, "No se encontro la persona");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al buscar la persona");
        }
        return persona;
    }
    
    public List<Persona> traerTodoPersona(){
        List<Persona> personas = new ArrayList<>();
        Persona persona = null;
        try {
            String sql = "SELECT * FROM persona";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                persona = new Persona();
                persona.setIdPersona(rs.getInt(1));
                persona.setDni(rs.getLong(2));
                persona.setPatologia(paD.buscarPatologiaId(rs.getInt(3)));
                persona.setNombre(rs.getString(4));
                persona.setApellido(rs.getString(5));
                persona.setAltura(rs.getDouble(6));
                persona.setPeso(rs.getDouble(7));
                persona.setFechaNac(LocalDate.parse(String.valueOf(rs.getDate(8))));
                persona.setCelular(rs.getLong(9));
                persona.setEmail(rs.getString(10));
                persona.setTrabajo(rs.getString(11));
                persona.setDepartamento(rs.getString(12));
                persona.setCiudad(rs.getString(13));
                personas.add(persona);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al traer todas las personas");
        }
        return personas;
    }
    
    public void bajaPersona(int id){
        try {
            String sql = "UPDATE persona SET activo=0 WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            if(ps.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "La persona se dio de baja");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja la persona");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja la persona");
        }
    }
}
