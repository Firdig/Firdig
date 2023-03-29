package modul2.bangun2d;

import modul2.LKBangun2D;

import java.util.Scanner;

public class lingkaran extends LKBangun2D {
    private double jarijari;


    @Override
    public void hitungKeliling() {
        // TODO Auto-generated method stub
        super.hitungKeliling();
        double phi=3.14;
        double kl = 2*phi*getJarijari();
        setKeliling(kl);
    }

    @Override
    public void hitungLuas() {
        // TODO Auto-generated method stub
        super.hitungLuas();
        double phi=3.14;
        double ls = phi*getJarijari()*getJarijari();
        setLuas(ls);
    }

    @Override
    public void InfoBangun() {
        // TODO Auto-generated method stub
        super.InfoBangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari Lingkaran : ");
        double z = masuk.nextDouble();
        setJarijari(z);


        hitungKeliling();
        hitungLuas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());


    }


    public double getJarijari(){
        return jarijari;
    }
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

}
