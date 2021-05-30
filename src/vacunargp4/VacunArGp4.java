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

//agregado para commit

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
        PatologiaData pad = new PatologiaData(con);
        SufreData sd = new SufreData(con);
        DosisData dd = new DosisData(con);
        
        //crear modelos.
        Persona p1 = new Persona(44530760,"Fabricio","Molina",1.78,80.0,LocalDate.of(2001, Month.OCTOBER, 21),2664,"bebo_sl_00@hotmail.com","¿Programador?","Pueyrredón","Capital");
        Laboratorio la1 = new Laboratorio("AstraZeneca","Oxford","Reino unido");
        Vacunatorio v1 = new Vacunatorio("HOSPITAL MARIA J. BECKER","Pueyrredón","La Punta");
        Patologia pat = new Patologia("Enfermedad prueba");
 
        
          //AgregarPatologia
//        pad.crearPatologia(pat);
        //Agregar una persona.
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
//        Persona per1 = pd.buscarPersonaDni(44530760);
//        Patologia pat1 = pad.buscarPatologiaNombre("Enfermedad prueba");
//        Sufre suf1 = new Sufre(per1, pat1);
//        sd.crearSufre(suf1);
        
//        //traer los sufre por idPersona.
//        for(Sufre a:sd.traerSufreIdPersona(8)){
//            System.out.println(a.toString());
//        }
//        //traer los sufre por idPatologia.
//        for(Sufre a:sd.traerSufreIdPatologia(9)){
//            System.out.println(a.toString());
//        }
//        //trae todos los sufre
//        for(Sufre a:sd.traerTodoSufre()){
//            System.out.println(a.toString());
//        }
        
//        //probar la clase data dosis.
//        Laboratorio lab = ld.buscarLaboratorioId(1);
//        Dosis dosi = new Dosis(lab,36,true);
//        dd.crearDosis(dosi);
//        
//        //traer dosis por id.
//        System.out.println(dd.buscarDosisId(1).toString());
//        //traer dosis por numSerie.
//        System.out.println(dd.buscarDosisNumSerie(1).toString());
        //traer dosis por idLaboratorio.
//        for(Dosis a:dd.traerDosisIdLaboratorio(1)){
//            System.out.println(a.toString());
//        }
//        //traer dosis por estado.
//        for(Dosis a:dd.traerDosisEstado(true)){
//            System.out.println(a.toString());
//        }
//        //traer todas las dosis.
//        for(Dosis e:dd.traerTodoDosis()){
//            System.out.println(e.toString());
//        }
        
        // probar la clase data aplica.
    }
    
}
