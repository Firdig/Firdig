package modul2.bangun3d;

import modul2.LKBangun3D;

import java.util.Scanner;

public class kerucut extends LKBangun3D {
    private double tinggi;
    private double jarijari;

    @Override
    public void hitungVolume(){
        super.hitungVolume();
        double phi = 3.14;
        double v = 0.33*phi*(getJarijari()*getJarijari())*getTinggi();
        setVolume(v);
    }
    @Override
    public void infoBangun(){
        super.infoBangun();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Kerucut : ");
        double z = input.nextDouble();
        setTinggi(z);
        System.out.print("Masukkan Jarijari Kerucut : ");
        double x = input.nextDouble();
        setJarijari(x);


        hitungVolume();

        System.out.println("Volume adalah :" + getVolume());
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }


    private double getTinggi(){
        return tinggi;
    }
    private double getJarijari(){
        return jarijari;
    }

}
