/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reinos;

import Edificaciones.Edificaciones_Accion;
import Recursos.Recursos_de_razas;
import Unidades.FabricaDeUnidades;
import Unidades.Unidades;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;
import luisa_arevalo.s_world.FabricaAbstracta;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaDeReinos  implements FabricaAbstracta{
    
    @Override
    public Reino_escogido getReino(String nombre_reino) {
        switch(nombre_reino){
            case "Arkanea":
                return new Arkanea();
            case "Rigel":
                return new Rigel();
            case "Zofia":
                return new Zofia();
        }
        return null;
    }

    @Override
    public Edificaciones_Accion getEdificacion(String nombre_edificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recursos_de_razas getRecurso(String nombre_recurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidades getUnidad(String nombre_unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo getVehiculo(String nombre_vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
