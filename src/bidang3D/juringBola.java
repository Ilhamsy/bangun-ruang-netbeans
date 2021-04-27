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
public class juringBola extends bola {
private double tinggiJB,r;

    public double getTinggiJB() {
        return tinggiJB;
    }

    public void setTinggiJB(double tinggiJB) {
        this.tinggiJB = tinggiJB;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double getLuasJuringBola() {
    return (2*Math.PI*getR()*getTinggiJB())+(Math.PI*getR()*getJari_jari());
    }
    
    public double getVolumeJuringBola() {
    return (2*Math.PI*Math.pow(getR(), 2)*getTinggiJB())/3;
    }
    
}
