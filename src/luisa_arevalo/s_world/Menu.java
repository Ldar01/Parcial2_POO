/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luisa_arevalo.s_world;

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
    
    
}
