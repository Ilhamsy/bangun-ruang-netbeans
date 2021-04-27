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
public class cincinBola extends bola {
private double tinggiCincin,tebalCincin,r;

    public double getTinggiCincin() {
        return tinggiCincin;
    }

    public void setTinggiCincin(double tinggiCincin) {
        this.tinggiCincin = tinggiCincin;
    }

    public double getTebalCincin() {
        return tebalCincin;
    }

    public void setTebalCincin(double tebalCincin) {
        this.tebalCincin = tebalCincin;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double getLuasCincinBola() {
    return 2*Math.PI*(getTinggiCincin()*(getJari_jari()+getR())+getTebalCincin()*(2*getR()+getTebalCincin()));
    }
}
