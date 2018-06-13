/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

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

    public void Menu_Jugar() {
        Unidades p;
        int opcion, unidad = 0, unidad_enemiga;
        //Scanner leer = new Scanner(System.in);
        System.out.println("\t ====== Player " + this.cod_Jug + " ========\n\n"
                + "\t 1. Ver tus unidades (u) \t 2. Ver tus edificaciones(e)\n"
                + "\t 3. Atacar (a) \t 4. Surrender (x)\n\n"
                + "\t Opcion: ");
        Scanner read = new Scanner(System.in);
        opcion = read.nextInt();
        switch (opcion) {
            case 1:
                this.reino_escogido.getListaUnidades().mostrarInformacionUnit();
                break;
            case 2:
                this.reino_escogido.getListaEdificaciones();
                break;
            case 3:
                System.out.println("Que unidad quieres que ataque?\n");
                this.reino_escogido.getListaUnidades().mostrarUnidadesPorOrden();
                unidad = read.nextInt();
                p = this.reino_escogido.getListaUnidades().EscogerUnidadParaAtacar(unidad);
                // System.out.println(this.reino_escogido.getListaUnidades().EscogerUnidadParaAtacar(unidad).getNombre_Unidad());

                break;
            case 4:
                break;
        }

    }

    public void Batallar(Reino kingdom) {
        int Opcion = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("\t Que quieres atacar?\n"
                + "\t 1. Unidad Enemiga\n"
                + "\t 2. Edificacion Enemiga\n\n");
        System.out.print("\t Opcion: ");
        Opcion = read.nextInt();
        switch (Opcion) {
            case 1:
                System.out.println("Que unidad deseas atacar?");
                kingdom.getListaUnidades().mostrarUnidadesPorOrden();
                break;
            case 2:
                break;
        }
    }


}
