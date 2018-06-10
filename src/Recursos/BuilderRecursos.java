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
public abstract class BuilderRecursos {
    protected Recurso recursos;
    
    public Recurso getRecurso(){
        return this.recursos;
    }
    
    public void CrearNuevoRecurso(){
        this.recursos = new Recurso();
    }
    
    public abstract void nombre();
    public abstract void descripcion();
    public abstract void cantidad();
    
    
}
