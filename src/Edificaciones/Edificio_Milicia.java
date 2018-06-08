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
public class Edificio_Milicia extends BuilderEdificacion{

    @Override
    public void nombre() {
        this.edificio.setNombre("Edificio de Unidades/Milicia");
    }

    @Override
    public void nivel() {
        this.edificio.setNivel(0);
    }

    @Override
    public void Puntos_Vitales() {
        this.edificio.setPV(175);
    }

    @Override
    public void descripcion() {
        this.edificio.setDescripcion("Edificio donde entrenan unidades para la \n"
                + "batalla\n");
    }

}
