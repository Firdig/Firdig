package modul2.bangun3d;

import modul2.LKBangun3D;

import java.util.Scanner;

public class kubus extends LKBangun3D {
    private double rusuk;
    @Override
    public void hitungVolume(){
        super.hitungVolume();
        double v = getRusuk()*getRusuk()*getRusuk();
        setVolume(v);
    }

    @Override
    public void infoBangun(){
        super.infoBangun();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi Kubus :");
        double x = input.nextDouble();
        setRusuk(x);

        hitungVolume();

        System.out.println("Volume adalah : "+ getVolume());
    }
    public void setRusuk(double rusuk){
        this.rusuk = rusuk;
    }
    private double getRusuk(){
        return rusuk;
    }
}
