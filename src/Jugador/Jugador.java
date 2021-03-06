/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Edificaciones.Edificacion;
import Reinos.Arkanea;
import Reinos.BuilderReinos;
import Reinos.Director_Reinos;
import Reinos.Reino;
import Reinos.Rigel;
import Reinos.Zofia;
import Unidades.ListaDeUnidades;
import Unidades.Unidades;
import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Jugador {

    private int cod_Jug;
    private Reino reino_escogido;
    private boolean turno = true;

    public Jugador(int cod_Jug) {
        this.cod_Jug = cod_Jug;
    }

    public Jugador() {
    }

    public int getCod_Jug() {
        return cod_Jug;
    }

    public void setCod_Jug(int cod_Jug) {
        this.cod_Jug = cod_Jug;
    }

    public Reino getReino_escogido() {
        return reino_escogido;
    }

    public void setReino_escogido(Reino reino_escogido) {
        this.reino_escogido = reino_escogido;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public Reino MenuJugador() {

        Director_Reinos fabricaReinos = new Director_Reinos();
        BuilderReinos ark = new Arkanea();
        BuilderReinos zof = new Zofia();
        BuilderReinos rig = new Rigel();

        Reino arkanea;
        Reino rigel;
        Reino zofia;

        System.out.println("\t===== Bienvenido al juego jugador " + this.cod_Jug + " =====\n\n");
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.println("\t **** Escoje tu reino! ****\n"
                    + "\t 1. Arkanea\n"
                    + "\t 2. Rigel\n"
                    + "\t 3. Zofia\n\n");
            System.out.print("\t Opcion: ");
            opcion = read.nextInt();
        } catch (Exception e) {
            System.err.println("Lo que escribiste probablemente no era una opcion (numero)\n"
                    + "por favor escribe un numero\n");
            System.out.println("\t **** Escoje tu reino! ****\n"
                    + "\t 1. Arkanea\n"
                    + "\t 2. Rigel\n"
                    + "\t 3. Zofia\n\n");
            System.out.print("\t Opcion: ");
            opcion = read.nextInt();
        }
        switch (opcion) {
            case 1:
                fabricaReinos.Construir_Reino(ark);
                arkanea = ark.getReino();
                this.setReino_escogido(arkanea);
                return arkanea;
            case 2:
                fabricaReinos.Construir_Reino(rig);
                rigel = rig.getReino();
                this.setReino_escogido(rigel);
                return rigel;
            case 3:
                fabricaReinos.Construir_Reino(zof);
                zofia = zof.getReino();
                this.setReino_escogido(zofia);
                return zofia;

        }
        return null;
    }

    public int Menu_ParaJugar() {
        Unidades p;
        int opcion;
        //Scanner leer = new Scanner(System.in);
        System.out.println("====== Player " + this.cod_Jug + " ========\n\n"
                + "1. Ver tus unidades  \t 2. Ver tus edificaciones\n"
                + "3. Atacar  \t 4. Terminar Turno \n\n"
                + "Opcion: ");
        Scanner read = new Scanner(System.in);
        opcion = read.nextInt();
        return opcion;
    }

    public Object Batallar(Reino kingdom) {
        int Opcion = 0, ataque;
        Unidades u;
        Edificacion e;
        Scanner read = new Scanner(System.in);
        System.out.println("\t Que quieres atacar?\n"
                + "\t 1. Unidad Enemiga\n"
                + "\t 2. Edificacion Enemiga\n\n");
        System.out.print("\t Opcion: ");
        Opcion = read.nextInt();
        switch (Opcion) {
            case 1:
                kingdom.getListaUnidades().VerificarUnitsAlive();
                if (!kingdom.getListaUnidades().VerificarIfUnitsDied()) {
                    System.out.println("Que unidad deseas atacar?\n");
                    kingdom.getListaUnidades().mostrarUnidadesPorOrden();
                    ataque = read.nextInt();
                    u = kingdom.getListaUnidades().EscogerUnidadParaAtacar(ataque);
                    return u;
                }
                System.out.println("Todas las Unidades Enemigas Murieron :v");
                return null;
            case 2:
                System.out.println("Que edificacion quieres atacar?\n");
                kingdom.getListaEdificaciones().mostrarEdificacionesPorOrden();
                ataque = read.nextInt();
                e = kingdom.getListaEdificaciones().EscogerUnidadParaAtacar(ataque);
                return e;
        }
        return null;
    }
}
