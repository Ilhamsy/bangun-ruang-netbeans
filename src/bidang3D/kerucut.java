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
public class kerucut extends lingkaran {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getLuasKerucut() {
    return Math.PI*getJari_jari()*(getJari_jari()+Math.sqrt(Math.pow(getJari_jari(), 2)+Math.pow(getTinggi(), 2)));
    }
    
    public double getVolumeKerucut() {
    return (getLuasLingkaran()*getTinggi())/3;
    }
}
