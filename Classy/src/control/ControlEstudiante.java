/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class ControlEstudiante {
    
        public boolean insertarEstudiante(Estudiante obje) {
        boolean t=false;
        Estudiante objEstudiate = new Estudiante();
        String sql="INSERT INTO profesor() value('"+ objEstudiate.getNombre1_estudiante() +"');";
        t = objEstudiate.insertEstudiate(sql);
        
        return t;       
        
    }
    
}
