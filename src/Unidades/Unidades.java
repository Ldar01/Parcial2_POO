package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Unidades {

    /**
     * Clase Unidades, esta es la clase base de las otras unidades
     * por defecto una unidad inicia con:
     * - 40 Puntos Vitales
     * - 35 de Ataque
     * - 30 de Defensa
     */
    
    private int PV = 40;
    private int Atk = 35;
    private int Def = 30;

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }
}
