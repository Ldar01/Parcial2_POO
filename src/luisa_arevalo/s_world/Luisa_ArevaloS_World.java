/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luisa_arevalo.s_world;

import Unidades.BuilderUnidades;
import Unidades.Director_Unidades;
import Unidades.Mercenario;
import Unidades.Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Luisa_ArevaloS_World {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director_Unidades objFabrica = new Director_Unidades();
        BuilderUnidades mercenario = new Mercenario();
        
        objFabrica.Construir(mercenario);
        Unidades mer = mercenario.getUnidad();
        
        mostrarCaracteristicas(mer);
    }
    
    public static void mostrarCaracteristicas(Unidades unidad){
        System.out.println("Nombre:\t"+ unidad.getNombre_Unidad());
        System.out.println("Puntos Vitales:\t"+ unidad.getPV());
        System.out.println("Ataque:\t"+ unidad.getAtk());
        System.out.println("Defensa:\t"+ unidad.getDef());
    }

}
