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
public abstract class BuilderUnidades {
    protected Unidades unidad;
    
    public Unidades getUnidad(){
        return this.unidad;
    }
    public void CrearNuevaUnidad(){
        this.unidad = new Unidades();
    }
    
    public abstract void ataque();
    public abstract void defensa();
    public abstract void nombre_Unidad();
    public abstract void Puntos_Vitales();
    public abstract void Disponibilidad();
    
    
}
