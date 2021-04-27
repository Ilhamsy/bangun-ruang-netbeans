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
public class tabung extends lingkaran{
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getLuasTabung() {
    return 2*getKelilingLingkaran()*(getJari_jari()+getTinggi());
    }
    
    public double getVolumeTabung() {
    return getLuasLingkaran()*getTinggi();
    }
    
}
