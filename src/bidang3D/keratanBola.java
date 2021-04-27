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
public class keratanBola extends bola {
private double t1,t2;

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }
    
    public double getLuasKeratanBola() {
    return 2*Math.PI*getJari_jari()*(getT2()-getT1());
    }
}
