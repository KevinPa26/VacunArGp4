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
public class Patologia implements Comparable<Patologia>{
    private int idPatologia;
    private String nombre;

    public Patologia(int idPatologia, String nombre) {
        this.idPatologia = idPatologia;
        this.nombre = nombre;
    }

    public Patologia(String nombre) {
        this.nombre = nombre;
    }

    public Patologia() {
    }

    public int getIdPatologia() {
        return idPatologia;
    }

    public void setIdPatologia(int idPatologia) {
        this.idPatologia = idPatologia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
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
        final Patologia other = (Patologia) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Patologia t) {
        return this.nombre.compareToIgnoreCase(t.nombre);
    }
}
