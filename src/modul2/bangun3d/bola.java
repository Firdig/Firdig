package modul2.bangun3d;

import modul2.LKBangun3D;

import java.util.Scanner;

public class bola extends LKBangun3D {
    private double jarijari;

    @Override
    public void hitungVolume(){
        super.hitungVolume();
        double phi = 3.14;
        double v = 0.75 * phi*(getJarijari()*getJarijari()*getJarijari());
        setVolume(v);
    }
    @Override
    public void infoBangun(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jarijari Bola : ");
        double x = input.nextDouble();
        setJarijari(x);

        hitungVolume();
        System.out.print("Volume adalah : "+getVolume());
    }

    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    private double getJarijari(){
        return jarijari;
    }
}
