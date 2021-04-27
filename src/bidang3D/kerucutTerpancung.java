/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang3D;
import bidang2D.lingkaran;

/**
 *
 * @author Acer
 */
public class kerucutTerpancung extends kerucut{
    private double tinggiKT, r, s;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getTinggiKT() {
        return tinggiKT;
    }

    public void setTinggiKT(double tinggiKT) {
        this.tinggiKT = tinggiKT;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double getVolumeKerucutTerpancung() {
    return Math.PI*getTinggiKT()*(Math.pow(getJari_jari(), 2)+getJari_jari()*getR()+Math.pow(getR(), 2));
    }
    
    public double getLuasKerucutTerpancung() {
    return Math.PI*getS()*(getR()+getJari_jari());
    }
}
