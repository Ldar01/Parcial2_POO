/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;

import Edificaciones.Edificacion;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Unidades {

    /**
     * Las estadisticas normales de una unidad normal son: 
     * - Puntos Vitales: 45
     * - Ataque: 40 
     * - Defensa: 35
     */
    private int PV = 45;
    private int Atk = 40;
    private int Def = 35;
    private String nombre_Unidad = "Soldado en entrenamiento";
    private boolean Available = true;

    int pv = 0, def = 0, atk = 0;

    public Unidades() {}

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

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    public void atacar(Object p) {
        Edificacion e = new Edificacion();
        Unidades u = new Unidades();
        System.out.println("Aqui 1");
//        String clase1, clase2, clase3;
//        clase1 = p.getClass().getName();
//        clase2 = e.getClass().getName();
//        clase3 = u.getClass().getName();
        System.out.println(p.getClass().getName());
        System.out.println(this.getClass().getName());
        if (p.getClass().getName() != this.getClass().getName()) {
            e = (Edificacion)p;
            if (e.isDisponible() && e.getPV() > 0) {
                atk = this.getAtk() - e.getDef();
                System.out.println("Efecto de ataque: "+ atk);
                pv = e.getPV() - atk;
                if (pv <= 0) {
                    e.setPV(0);
                    System.out.println(e.getNombre()+" fue destruido por "+this.getNombre_Unidad());
                    e.setDisponible(false);
                    
                }
                else{
                    e.setPV(pv);
                }
            }
        }
        if (p.getClass().getName() == this.getClass().getName()) {
            System.out.println("Aqui 4");
            System.out.println(p.getClass().isInstance(u));
            u = (Unidades)p;
            System.out.println("Clase de objeto p");
            System.out.println(u.getNombre_Unidad());
            System.out.println(u.getAtk());
            if (u.isAvailable() && u.getPV() > 0) {
                System.out.println("Aqui 5");
                atk = this.getAtk() - u.getDef();
                System.out.println("Efecto de ataque: "+ atk);
                pv = u.getPV() - atk;
                if (pv <= 0) {
                    System.out.println("Aqui 6");
                    u.setPV(0);
                    System.out.println(u.getNombre_Unidad()+" fue asesinado por "+this.getNombre_Unidad());
                    u.setAvailable(false);
                    
                }
                else{
                    System.out.println("Aqui 7");
                    u.setPV(pv);
                }
            }
        }
    }
}
