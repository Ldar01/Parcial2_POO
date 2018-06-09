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
public class Rigel extends BuilderReinos{
    ListaEdificaciones listaEdificaciones;
    ListaDeUnidades listaUnidades;
    
    @Override
    public void nombre_Reino() {
        this.reino.setNombre("Rigel");
    }

    @Override
    public void Edificaciones_Reino() {
        this.reino.setListaEdificaciones(listaEdificaciones);
    }

    @Override
    public void Unidades_Reino() {
        this.reino.setListaUnidades(listaUnidades);
    }
}
