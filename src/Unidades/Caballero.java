package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Caballero extends Unidades implements Unidad_accion{
    //Para ponerle el ataque y defensa al caballero
    @Override
    public void setDef(int Def) {
        super.setDef(Def); //To change body of generated methods, choose Tools | Templates.
    }

    @Override    
    public void setAtk(int Atk) {
        super.setAtk(Atk); //To change body of generated methods, choose Tools | Templates.
    }

    //Para poner los puntos vitales del caballero
    @Override
    public void setPV(int PV) {
        super.setPV(PV); //To change body of generated methods, choose Tools | Templates.
    }    
    //Acciones de la unidad caballero
    @Override
    public int atacar(Object edificio_o_unidad) {
        System.out.println("Hya!!");
        return 0;
    }

    @Override
    public void defender(Object edificio_o_unidad) {
        System.out.println("I wont let you pass");
    }

    @Override
    public void esperar() {
        System.out.println("As you wish");
    }
    
    public Caballero Build(){
        return this;
    }

}
