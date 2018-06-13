/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reinos;

import Edificaciones.ListaEdificaciones;
import Unidades.ListaDeUnidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Reino {
    private String Nombre;
    private ListaEdificaciones listaEdificaciones;
    private ListaDeUnidades listaUnidades;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ListaEdificaciones getListaEdificaciones() {
        return listaEdificaciones;
    }

    public void setListaEdificaciones(ListaEdificaciones listaEdificaciones) {
        this.listaEdificaciones = listaEdificaciones;
    }

    public ListaDeUnidades getListaUnidades() {
        return listaUnidades;
    }

    public void setListaUnidades(ListaDeUnidades listaUnidades) {
        this.listaUnidades = listaUnidades;
    }    
}
