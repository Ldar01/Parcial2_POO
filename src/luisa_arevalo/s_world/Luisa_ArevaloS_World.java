/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luisa_arevalo.s_world;

import Reinos.Reino_escogido;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Luisa_ArevaloS_World {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaAbstracta l;
        l= FabricaProductora.getFactory("Reino");
        Reino_escogido reino = l.getReino("Arkanea");
        reino.Grupo_de_Unidades(4);
    }

}
