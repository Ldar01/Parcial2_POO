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
public class Mercenario extends BuilderUnidades {

    @Override
    public void ataque() {
        this.unidad.setAtk(45);

        //System.out.println("Hya!!!");
    }

    @Override
    public void defensa() {
        this.unidad.setDef(30);
        //System.out.println("No dejare que me destruyas");
    }

    @Override
    public void nombre_Unidad() {
        this.unidad.setNombre_Unidad("Mercenario");
    }

    @Override
    public void Puntos_Vitales() {
        this.unidad.setPV(45);
    }

    @Override
    public void Disponibilidad() {
        this.unidad.setAvailable(true);
    }

  
}
