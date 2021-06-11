/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4.modelo;

import java.util.Objects;

/**
 *
 * @author kevin
 */
public class Laboratorio implements Comparable<Laboratorio>{
    private int idLaboratorio;
    private String nombre;
    private String direccion;
    private String paisOrigen;

    public Laboratorio(int idLaboratorio, String nombre, String direccion, String paisOrigen) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.paisOrigen = paisOrigen;
    }

    public Laboratorio(String nombre, String direccion, String paisOrigen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.paisOrigen = paisOrigen;
    }

    public Laboratorio() {
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return direccion;
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laboratorio other = (Laboratorio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Laboratorio t) {
        return this.nombre.compareToIgnoreCase(t.nombre);
    }
}
