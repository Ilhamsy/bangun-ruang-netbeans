/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang3D;

/**
 *
 * @author Acer
 */
public class temberengBola extends bola {
    private double tinggiTB;

    public double getTinggiTB() {
        return tinggiTB;
    }

    public void setTinggiTB(double tinggiTB) {
        this.tinggiTB = tinggiTB;
    }
    
    public double getVolumeTemberengBola() {
    return (Math.PI*Math.pow(getTinggiTB(), 2)*(3*getJari_jari()-getTinggiTB()))/3;
    }
    
    public double getLuasTemberengBola() {
    return 2*Math.PI*getJari_jari()*getTinggiTB();
    }
    
}
