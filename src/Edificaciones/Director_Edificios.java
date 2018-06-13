/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Edificaciones;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Director_Edificios {

    public Director_Edificios() {}
    
    public void Construir_Edificio(BuilderEdificacion build){
        build.CrearNuevaEdificacion();
        build.nombre();
        build.Puntos_Vitales();
        build.defensa();
        build.Disponibilidad();
        build.descripcion();
        build.nivel();
    }
    
}
