/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luisa
 */
public class ListaDeUnidades {
    private ArrayList <Unidades> listaUnidades;
    
    public ListaDeUnidades(){
        listaUnidades = new ArrayList<>();
    }
    
    public void AgregarUnidades(){
        
        Director_Unidades FabricaDeUnidades = new Director_Unidades();
        BuilderUnidades mercenario = new Mercenario();
        BuilderUnidades caballero = new Caballero();
        BuilderUnidades soldado = new Soldado();
        
        Unidades mer;
        Unidades cab;
        Unidades sol;
        
        Scanner read = new Scanner(System.in);
        String nombre_Unit;
        
        System.out.println("Que Unidad desea para su Reino?\n"
                + "- Milicia\n"
                + "- Vehiculo\n"
                + "- Recursos\n"
                + "Opcion: \n");
        nombre_Unit = read.nextLine();
        
        switch(nombre_Unit){
            case "Soldado":
                FabricaDeUnidades.Construir(soldado);
                sol = soldado.getUnidad();
                listaUnidades.add(sol);
                System.out.println("Agregado!");
                break;
            case "Caballero":
                FabricaDeUnidades.Construir(caballero);
                cab = caballero.getUnidad();
                listaUnidades.add(cab);
                System.out.println("Agregado!");
                break;
            case "Mercenario":
                FabricaDeUnidades.Construir(mercenario);
                mer = mercenario.getUnidad();
                listaUnidades.add(mer);
                System.out.println("Agregado!");
                break;
            default:
                System.out.println("No se puede agregar porque lo que escribio\n"
                        + "puede ser que no exista o esta mal escrito");
                break;
        }

    }
    public void mostrarInformacionUnit() {
        if (listaUnidades.isEmpty()) {
            System.out.println("La lista esta vacia\n");
        } else {
            for (Unidades u : listaUnidades) {
                System.out.println("==================================\n");
                System.out.println(u.getNombre_Unidad());
                System.out.println("Puntos Vitales:\t" + u.getPV());
                System.out.println("Ataque:\t" + u.getAtk());
                System.out.println("Defensa:\t" + u.getDef());
                System.out.println("===================================\n");
            }
        }

    }
}
