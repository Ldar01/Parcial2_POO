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
public interface Unidad_accion {
    int atacar(Object edificio_o_unidad); //Retornara el danio que cometio al edificio o unidad enemiga
    void defender(Object edificio_o_unidad);
    void esperar();
}
