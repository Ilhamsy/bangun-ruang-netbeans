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
public class bola extends lingkaran{
    public double getLuasBola() {
    return 4*Math.PI*Math.pow(getJari_jari(), 2);
    }
    
    public double getVolumeBola() {
    return (getLuasBola()*getJari_jari())/3;
    }
    
}
