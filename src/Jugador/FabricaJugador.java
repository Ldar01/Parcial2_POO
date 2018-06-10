/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jugador;

import luisa_arevalo.s_world.FabricaAbstracta;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaJugador implements FabricaAbstracta{

    @Override
    public Jugador getPlayer(int numero_jugador) {
        switch(numero_jugador){
            case 1:
                return new Jugador1();
            case 2:
                return new Jugador2();
        }
        return null;
    }

}
