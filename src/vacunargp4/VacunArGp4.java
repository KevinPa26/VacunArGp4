/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunargp4;

import java.time.LocalDate;
import java.time.Month;
import vacunargp4.control.*;
import vacunargp4.modelo.*;

/**
 *
 * @author kevin
 */
public class VacunArGp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con = new Conexion();
        
        //clases datas.
        PersonaData pd = new PersonaData(con);
        LaboratorioData ld = new LaboratorioData(con);
        VacunatorioData vd = new VacunatorioData(con);
        
        //crear modelos.
        Persona p1 = new Persona(39137254,"kevin","paredes",1.7,55.5,LocalDate.of(1995, Month.OCTOBER, 26),15853182,"kevinenriquep26@gmail.com","programador","Pueyrredón","La Punta");
        Laboratorio la1 = new Laboratorio("AstraZeneca","Oxford","Reino unido");
        Vacunatorio v1 = new Vacunatorio("HOSPITAL MARIA J. BECKER","Pueyrredón","La Punta");
        
        
//        //Agregar una persona.
//        pd.crearPersona(p1);

//        //Buscar persona por dni.
//        System.out.println(pd.buscarPersonaDni(39137254));

//        //Buscar persona por id.
//        System.out.println(pd.buscarPersonaId(1));

//        //Traer todas las personas.
//        for(Persona per:pd.traerTodoPersona()){
//            System.out.println(per);
//        }
        
//        //agregar un laboratorio.
//        ld.crearLaboratorio(la1);

//        //Buscar un laboratorio por id.
//        System.out.println(ld.buscarLaboratorioId(1));

//        //traer todos los laboratorios.
//        for(Laboratorio lab:ld.traerTodoLaboratorio()){
//            System.out.println(lab);
//        }
        
//        //Agregar un vacunatorio.
//        vd.crearVacunatorio(v1);

//        //Buscar vacunatorio por id.
//        System.out.println(vd.buscarVacunatorioId(1));

//        //Buscar vacunatorio por nombre.
//        System.out.println(vd.buscarVacunatorioNombre("HOSPITAL MARIA J. BECKER"));

//        //Traer todos los vacunatorios.
//        for(Vacunatorio vac:vd.traerTodoVacunatorio()){
//            System.out.println(vac);
//        }
        
        //Probar la clase data sufreData.
        
        
        //probar la clase data dosis.
        
        
        // probar la clase data aplica.
    }
    
}
