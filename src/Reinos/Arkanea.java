/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reinos;

import Unidades.FabricaDeUnidades;
import Unidades.Unidades;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Arkanea implements Reino_escogido{
    
    ArrayList <Unidades> lista_de_unidades = new ArrayList<>();
    Scanner p;
    String nombre;
    FabricaDeUnidades x;

    @Override
    public void Grupo_de_Unidades(int Cantidad) {
        for(int i=0; i<=Cantidad; i++){
            System.out.print("Escriba el nombre de la unidad que necesita: ");
            nombre = p.nextLine();
            lista_de_unidades.add(x.getUnidad(nombre));
        }
    }

    @Override
    public void Tipo_recursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Edificaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Vehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
