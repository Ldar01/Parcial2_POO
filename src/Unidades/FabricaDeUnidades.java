/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unidades;

import Edificaciones.Edificaciones_Accion;
import Recursos.Recursos_de_razas;
import Reinos.Reino_escogido;
import Vehiculos.Vehiculo;
import luisa_arevalo.s_world.FabricaAbstracta;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaDeUnidades implements FabricaAbstracta{

    @Override
    public Reino_escogido getReino(String nombre_reino) {
        return null;
    }

    @Override
    public Edificaciones_Accion getEdificacion(String nombre_edificacion) {
        return null;
    }

    @Override
    public Recursos_de_razas getRecurso(String nombre_recurso) {
        return null;
    }

    @Override
    public Unidades getUnidad(String nombre_unidad) {
        switch(nombre_unidad){
            case "Soldado":
                return new Soldado();
            case "Caballero":
                return new Caballero();
            case "Mercenario":
                return new Mercenario();
        }
        return null;
    }

    @Override
    public Vehiculo getVehiculo(String nombre_vehiculo) {
        return null;
    }

}
