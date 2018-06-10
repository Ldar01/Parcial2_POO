/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Director_Recursos {

    public Director_Recursos() {}
    
    public void Construir(BuilderRecursos build){
        build.CrearNuevoRecurso();
        build.nombre();
        build.descripcion();
        build.cantidad();
    }
    
}
