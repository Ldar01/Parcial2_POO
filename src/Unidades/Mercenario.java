package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Mercenario extends Unidades implements Unidad_accion {

    @Override
    public void setDef(int Def) {
        super.setDef(Def);
    }

    @Override
    public void setAtk(int Atk) {
        super.setAtk(Atk); 
    }

    @Override
    public void setPV(int PV) {
        super.setPV(PV); 
    }
 
    @Override
    public int atacar(Object edificio_o_unidad) {
        return 0;
    }

    @Override
    public void defender(Object edificio_o_unidad) {
        System.out.println("You can't touch me");
    }

    @Override
    public void esperar() {
        System.out.println("Ready when you are");
    }
    
    public Mercenario Build(){
        return this;
    }

}
