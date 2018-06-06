package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Soldado extends Unidades implements Unidad_accion {

    @Override
    public void setDef(int Def) {
        super.setDef(Def); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAtk(int Atk) {
        super.setAtk(Atk); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPV(int PV) {
        super.setPV(PV); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int atacar(Object edificio_o_unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender(Object edificio_o_unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void esperar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
