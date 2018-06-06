/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luisa_arevalo.s_world;

import Edificaciones.Edificaciones_Accion;
import Recursos.Recursos_de_razas;
import Reinos.Reino_escogido;
import Vehiculos.Vehiculo;
import Unidades.Unidad_accion;
import Unidades.Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public interface FabricaAbstracta {
    Reino_escogido getReino(String nombre_reino);
    Edificaciones_Accion getEdificacion(String nombre_edificacion);
    Recursos_de_razas getRecurso(String nombre_recurso);
    Unidades getUnidad(String nombre_unidad);
    Vehiculo getVehiculo(String nombre_vehiculo);
    
}
