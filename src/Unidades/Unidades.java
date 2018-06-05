/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unidades;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Unidades {
    public int PV;
    public final int Atk;
    public final int Def;

    public Unidades(int Atk, int Def) {
        this.Atk = Atk;
        this.Def = Def;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getAtk() {
        return Atk;
    }

//    public void setAtk(int Atk) {
//        this.Atk = Atk;
//    }

    public int getDef() {
        return Def;
    }

//    public void setDef(int Def) {
//        this.Def = Def;
//    }
    public static class BuilderUnidades {

        public int PV;
        public final int Atk;
        public final int Def;

        public BuilderUnidades(int Atk, int Def) {
            this.Atk = Atk;
            this.Def = Def;
        }

        public Unidades build() {
            return new Unidades(this);
        }

        public BuilderUnidades PV(int pv) {
            this.PV = pv;
            return this;
        }
    }
    public Unidades(BuilderUnidades build){
        this.PV = build.PV;
        this.Atk = build.Atk;
        this.Def = build.Def;
    }
    
}
