/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import bidang2D.*;
import bidang3D.*;
import java.text.DecimalFormat;

/**
 *
 * @author Acer
 */
public class main {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.###");
        
        lingkaran Lingkaran =  new lingkaran();
        Lingkaran.setJari_jari(21);
        segiempat SegiEmpat = new segiempat();
        SegiEmpat.setPanjang(20);
        SegiEmpat.setLebar(10);
        segitiga SegiTiga = new segitiga();
        SegiTiga.setAlas(10);
        SegiTiga.setTinggi(20);
        bola Bola = new bola();
        temberengBola TemberengBola = new temberengBola();
        TemberengBola.setTinggiTB(7);
        juringBola JuringBola = new juringBola();
        JuringBola.setTinggiJB(7);
        JuringBola.setR(7);
        cincinBola CincinBola = new cincinBola();
        CincinBola.setTinggiCincin(9);
        CincinBola.setR(7);
        CincinBola.setTebalCincin(2);
        keratanBola KeratanBola = new keratanBola();
        KeratanBola.setT1(6);
        KeratanBola.setT2(8);
        tabung Tabung = new tabung();
        Tabung.setTinggi(30);
        kerucut Kerucut =  new kerucut();
        Kerucut.setTinggi(25);
        kerucutTerpancung KerucutTerpancung = new kerucutTerpancung();
        KerucutTerpancung.setTinggiKT(7);
        KerucutTerpancung.setR(14);
        KerucutTerpancung.setS(9);
        
        System.out.println("=================================================");
        System.out.println("Keliling Lingkaran\t\t= "+format.format(Lingkaran.getKelilingLingkaran()));
        System.out.println("Luas Lingkaran\t\t\t= "+format.format(Lingkaran.getLuasLingkaran()));
        System.out.println("Keliling Segiempat\t\t= "+format.format(SegiEmpat.getKelilingsegiempat()));
        System.out.println("Luas Segiempat\t\t\t= "+format.format(SegiEmpat.getLuassegiempat()));
        System.out.println("Luas Segitiga\t\t\t= "+format.format(SegiTiga.getLuassegitiga()));
        System.out.println("Luas Bola\t\t\t= "+format.format(Bola.getLuasBola()));
        System.out.println("Volume Bola\t\t\t= "+format.format(Bola.getVolumeBola()));
        System.out.println("Luas Tembereng Bola\t\t= "+format.format(TemberengBola.getLuasTemberengBola()));
        System.out.println("Volume Tembereng Bola\t\t= "+format.format(TemberengBola.getVolumeTemberengBola()));
        System.out.println("Luas Juring Bola\t\t= "+format.format(JuringBola.getLuasJuringBola()));
        System.out.println("Volume Juring Bola\t\t= "+format.format(JuringBola.getVolumeJuringBola()));
        System.out.println("Luas Cincin Bola\t\t= "+format.format(CincinBola.getLuasCincinBola()));
        System.out.println("Luas Keratan Bola\t\t= "+format.format(KeratanBola.getLuasKeratanBola()));
        System.out.println("Luas Tabung\t\t\t= "+format.format(Tabung.getLuasTabung()));
        System.out.println("Volume Tabung\t\t\t= "+format.format(Tabung.getVolumeTabung()));
        System.out.println("Luas Kerucut\t\t\t= "+format.format(Kerucut.getLuasKerucut()));
        System.out.println("Volume Kerucut\t\t\t= "+format.format(Kerucut.getVolumeKerucut()));
        System.out.println("Luas Kerucut Terpancung\t\t= "+format.format(KerucutTerpancung.getLuasKerucutTerpancung()));
        System.out.println("Volume Kerucut Terpancung\t= "+format.format(KerucutTerpancung.getVolumeKerucutTerpancung()));
        System.out.println("=================================================");
    }
}
