/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luisa_arevalo.s_world;

import Jugador.FabricaJugador;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaProductora {
    public static FabricaAbstracta getFabrica(String jugador){
        return new FabricaJugador();
    }
}
