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
public class Soldado extends BuilderUnidades{

    @Override
    public void atacar() {
        this.unidad.setAtk(40);
    }

    @Override
    public void defender() {
        this.unidad.setDef(35);
    }

    @Override
    public void nombre_Unidad() {
        this.unidad.setNombre_Unidad("Soldado");
    }

    @Override
    public void Puntos_Vitales() {
        this.unidad.setPV(45);
    }

}
