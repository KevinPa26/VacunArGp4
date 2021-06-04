/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kevin
 */
public class CitaVacunacion {
    private int idCita;
    private Persona persona;
    private Vacunatorio vacunatorio;
    private Dosis dosis;
    private LocalDate fecha;
    private LocalTime hora;
    private String estado;
    private String cantDosis;

    public CitaVacunacion(int idCita, Persona persona, Vacunatorio vacunatorio, Dosis dosis, LocalDate fecha, LocalTime hora, String estado, String cantDosis) {
        this.idCita = idCita;
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.dosis = dosis;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.cantDosis = cantDosis;
    }

    public CitaVacunacion(Persona persona, Vacunatorio vacunatorio, Dosis dosis, LocalDate fecha, LocalTime hora, String estado, String cantDosis) {
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.dosis = dosis;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.cantDosis = cantDosis;
    }

    public CitaVacunacion(Persona persona, Vacunatorio vacunatorio, LocalDate fecha, LocalTime hora, String estado, String cantDosis) {
        this.persona = persona;
        this.vacunatorio = vacunatorio;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.cantDosis = cantDosis;
    }

    public CitaVacunacion() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vacunatorio getVacunatorio() {
        return vacunatorio;
    }

    public void setVacunatorio(Vacunatorio vacunatorio) {
        this.vacunatorio = vacunatorio;
    }

    public Dosis getDosis() {
        return dosis;
    }

    public void setDosis(Dosis dosis) {
        this.dosis = dosis;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCantDosis() {
        return cantDosis;
    }

    public void setCantDosis(String cantDosis) {
        this.cantDosis = cantDosis;
    }

    @Override
    public String toString() {
        return "CitaVacunacion{" + "idCita=" + idCita + ", persona=" + persona + ", vacunatorio=" + vacunatorio + ", dosis=" + dosis + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + ", cantDosis=" + cantDosis + '}';
    }
    
}
