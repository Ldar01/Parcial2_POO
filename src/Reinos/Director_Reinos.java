/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reinos;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Director_Reinos {

    public Director_Reinos() {}
    
    public void Construir_Reino(BuilderReinos build){
        build.CrearNuevoReino();
        build.nombre_Reino();
        build.Edificaciones_Reino();
        build.Unidades_Reino();
    }

}
