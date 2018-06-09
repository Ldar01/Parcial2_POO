/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luisa
 */
public class ListaEdificaciones {

    private ArrayList<Edificacion> listaEdificios;

    public ListaEdificaciones() {
        listaEdificios = new ArrayList<>();
    }

    public void AgregarEdificioAReino() {

        Director_Edificios FabricaDeEdificios = new Director_Edificios();
        BuilderEdificacion Edf_Mil = new Edificio_Milicia();
        BuilderEdificacion Edf_Rec = new Edificio_Recursos();
        BuilderEdificacion Edf_Veh = new Edificio_Vehiculos();

        Edificacion Milicia;
        Edificacion Recursos;
        Edificacion Vehiculos;

        Scanner read = new Scanner(System.in);
        String nombre_Edf;

        System.out.println("Que edificio desea para su Reino?\n"
                + "- Milicia\n"
                + "- Vehiculo\n"
                + "- Recursos\n"
                + "Opcion: \n");
        nombre_Edf = read.nextLine();

        switch (nombre_Edf) {
            case "Milicia":
                FabricaDeEdificios.Construir_Edificio(Edf_Mil);
                Milicia = Edf_Mil.getEdificacion();
                listaEdificios.add(Milicia);
                System.out.println("Agregado!");
                break;
            case "Vehiculo":
                FabricaDeEdificios.Construir_Edificio(Edf_Veh);
                Vehiculos = Edf_Veh.getEdificacion();
                listaEdificios.add(Vehiculos);
                System.out.println("Agregado!");
                break;
            case "Recursos":
                FabricaDeEdificios.Construir_Edificio(Edf_Rec);
                Recursos = Edf_Rec.getEdificacion();
                listaEdificios.add(Recursos);
                System.out.println("Agregado");
                break;
            default:
                System.out.println("No se puede agregar ese edificio porque no existe\n"
                        + "de ese tipo o escribio mal el nombre");
                break;

        }
    }

    public void mostrarInformacionEdf() {
        if (listaEdificios.isEmpty()) {
            System.out.println("La lista esta vacia\n");
        } else {
            for (Edificacion e : listaEdificios) {
                System.out.println("==================================\n");
                System.out.println(e.getNombre());
                System.out.println("Nivel:\t" + e.getNivel());
                System.out.println("Puntos Vitales:\t" + e.getPV());
                System.out.println("Descripcion:\t" + e.getDescripcion());
                System.out.println("===================================\n");
            }
        }

    }

}
