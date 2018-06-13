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
public abstract class BuilderEdificacion {
    protected Edificacion edificio;

    public Edificacion getEdificacion(){
        return this.edificio;
    }
    
    public void CrearNuevaEdificacion(){
        this.edificio = new Edificacion();
    }
    
    public abstract void nombre();
    public abstract void nivel();
    public abstract void Puntos_Vitales();
    public abstract void defensa();
    public abstract void Disponibilidad();
//    public abstract void recursoA();
//    public abstract void recursoB();
//    public abstract void recursoC();
//    public abstract void unidad_entrenamiento();
    public abstract void descripcion();
    
}
