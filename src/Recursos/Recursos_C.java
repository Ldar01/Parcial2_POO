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
public class Recursos_C extends BuilderRecursos{
        @Override
    public void nombre() {
        this.recursos.setNombre("Recursos C");
    }

    @Override
    public void descripcion() {
        this.recursos.setDescripcion("Recurso raro dificil de encontrar (Multiusos)");
    }

    @Override
    public void cantidad() {
        this.recursos.setCantidad(100);
    }
}
