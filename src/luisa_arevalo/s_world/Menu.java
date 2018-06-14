/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luisa_arevalo.s_world;

import Edificaciones.Edificacion;
import Jugador.Jugador;
import Unidades.Unidades;
import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Menu {

    private static Menu menu;
    public static int fase = 0;

    public Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        } else {
            System.out.println("No se puede crear otro objeto Menu porque ya existe");
        }
        return menu;
    }

    public void Inicio() {
        int opcion, opcion2, unidad, opcion3, edificacion;
        Scanner read = new Scanner(System.in);
        Jugador player1 = new Jugador(1);
        Jugador player2 = new Jugador(2);
        Unidades u = new Unidades();
        Edificacion ed = new Edificacion();

        System.out.println("\t============ Bienvenido a Luisa's World ===============\n\n"
                + "\t 1) Jugar\n"
                + "\t 2) Salir\n\n");
        System.out.print("\tOpcion: ");
        try {
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    player1.MenuJugador();
                    player2.MenuJugador();
                    while(player1.isTurno()){
                        System.out.println("==== TURNO DEL JUGADOR 1 ===");
                        player1.Menu_ParaJugar();
                        opcion2 = read.nextInt();
                        switch (opcion2) {
                            case 1:
                                player1.getReino_escogido().getListaUnidades().mostrarInformacionUnit();
                                break;
                            case 2:
                                player1.getReino_escogido().getListaEdificaciones().mostrarInformacionEdf();
                                break;
                            case 3:
                                System.out.println("Aqui 1");
                                player1.Batallar(player2.getReino_escogido());
                                System.out.println("Aqui 2");
                                break;
                            case 4:
                                System.out.println("Aqui 3");
                                player1.setTurno(false);
                                System.out.println("Aqui 4");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del juego.......");
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
        } catch (Exception e) {
            System.err.println("Lo que ingresaste no es un numero");
            read.nextLine();
        }
    }

    public void Opciones_Jugador(int opcion) {

    }

}
