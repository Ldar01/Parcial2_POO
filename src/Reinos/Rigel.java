/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reinos;

import Edificaciones.ListaEdificaciones;
import Unidades.ListaDeUnidades;
import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Rigel extends BuilderReinos {

    ListaEdificaciones listaEdificaciones = new ListaEdificaciones();
    ListaDeUnidades listaUnidades = new ListaDeUnidades();

    @Override
    public void nombre_Reino() {
        this.reino.setNombre("Rigel");
    }

    @Override
    public void Edificaciones_Reino() {
        System.out.println("\t==== Bienvenido al reino de Rigel ====\n\n"
                + "Para comenzar necesitamos que tu escojas tus edificios que quieres\n"
                + "en tu reino\n\n");
        Scanner read = new Scanner(System.in);
        int numero_Edf;

        System.out.print("Nota: El Centro de mando ya esta incluido en su reino\n"
                + "Ingrese la cantidad de edificios(Maximo 2): ");
        numero_Edf = read.nextInt();
        if ((numero_Edf > 2) || (numero_Edf <= 0)) {
            System.out.println("No puede agregar mas de 5 o no puede ingresar un numero negativo");
        } else {
            for (int i = 0; i < numero_Edf; i++) {
                System.out.println("Edificio " + (i + 1));
                listaEdificaciones.AgregarEdificioAReino();
            }
            this.reino.setListaEdificaciones(listaEdificaciones);
        }

    }

    @Override
    public void Unidades_Reino() {
        Scanner read = new Scanner(System.in);
        int numero_Unidades = 0;

        System.out.print("\nAhora necesitamos sus unidades para defender su reino\n"
                + "Ingrese la CANTIDAD de unidades (Maximo 5): ");
        do {
            try {
                numero_Unidades = read.nextInt();
                System.out.println("\n");
                if ((numero_Unidades > 5) || (numero_Unidades <= 0)) {
                    System.out.println("No puede agregar mas de 5 o no puede ingresar un numero negativo");
                } else {
                    for (int i = 0; i < numero_Unidades; i++) {
                        System.out.println("Unidad " + (i + 1));
                        listaUnidades.AgregarUnidades();
                    }
                    this.reino.setListaUnidades(listaUnidades);
                }
            } catch (Exception e) {
                System.err.println("Lo que ingresaste no es un numero");
                //numero_Unidades = read.nextInt();
                read.nextLine();
            }

        } while (numero_Unidades > 5 || numero_Unidades <= 0);

    }
}
