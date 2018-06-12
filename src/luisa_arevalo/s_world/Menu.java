/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luisa_arevalo.s_world;

import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Menu {
    private static Menu menu;

    public Menu() {}
    
    public static Menu getInstance(){
        if(menu == null){
            menu = new Menu();
        }
        else{
            System.out.println("No se puede crear otro objeto Menu porque ya existe");
        }
        return menu;
    }
    
    public void Inicio(){
        int opcion;
        Scanner read = new Scanner(System.in);
        System.out.println("\t============ Bienvenido a Luisa's World ===============\n\n"
                + "\t 1) Jugar\n"
                + "\t 2) Salir\n\n");
        System.out.print("\tOpcion: ");
        try{
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    break;
                case 2:
                    System.out.println("Saliendo del juego.......");
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
        }catch (Exception e) {
            System.err.println("Lo que ingresaste no es un numero");
            read.nextLine();
        }
    }
    
    public void Opciones_Jugador(){
        System.out.println("=========");
    }
    
    
}
