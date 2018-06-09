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
public abstract class BuilderReinos {
    protected Reino reino;
    
    public Reino getReino(){
        return this.reino;
    }
    
    public void CrearNuevoReino(){
        this.reino = new Reino();
    }
    
    public abstract void nombre_Reino();
    public abstract void Edificaciones_Reino();
    public abstract void Unidades_Reino();
}
