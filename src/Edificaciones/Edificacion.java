/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Edificaciones;

import Recursos.Recurso;
import Unidades.Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Edificacion {
    private String nombre = "Centro de mando";
    private int nivel = 1;
    private int PV = 300;
    private String descripcion ="Edificacion principal del reino";
    private int def = 35;
    private boolean disponible = true;
    private Recurso recursoA;
    private Recurso recursoB;
    private Recurso recursoC;
    private Unidades entrenamiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Recurso getRecursoA() {
        return recursoA;
    }

    public void setRecursoA(Recurso recursoA) {
        this.recursoA = recursoA;
    }

    public Recurso getRecursoB() {
        return recursoB;
    }

    public void setRecursoB(Recurso recursoB) {
        this.recursoB = recursoB;
    }

    public Recurso getRecursoC() {
        return recursoC;
    }

    public void setRecursoC(Recurso recursoC) {
        this.recursoC = recursoC;
    }

    public Unidades getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(Unidades entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
    
    
}
