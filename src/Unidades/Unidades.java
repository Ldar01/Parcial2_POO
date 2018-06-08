/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */


public class Unidades {
    
    /**
     * Las estadisticas normales de una unidad normal son:
     * - Puntos Vitales: 45
     * - Ataque:    40
     * - Defensa:   35
     */
    
    private int PV;
    private int Atk;
    private int Def;
    private String nombre_Unidad;
    
    public Unidades(){}

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }

    public String getNombre_Unidad() {
        return nombre_Unidad;
    }

    public void setNombre_Unidad(String nombre_Unidad) {
        this.nombre_Unidad = nombre_Unidad;
    }
    
    
}
