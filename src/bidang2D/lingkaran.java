/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2D;

/**
 *
 * @author Acer
 */
public class lingkaran {
    protected static double jari_jari;

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getKelilingLingkaran() {
        return 2*Math.PI*getJari_jari();
    }

    public double getLuasLingkaran() {
        return Math.PI*Math.pow(getJari_jari(), 2);
    }

}
