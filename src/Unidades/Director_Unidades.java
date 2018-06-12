/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Director_Unidades {

    public Director_Unidades() {}
    
    public void Construir( BuilderUnidades build){
        build.CrearNuevaUnidad();
        build.nombre_Unidad();
        build.Puntos_Vitales();
        build.ataque();
        build.defensa();
        build.Disponibilidad();
    }
    
}
