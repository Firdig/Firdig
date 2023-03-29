package modul2.bangun2d;

import java.util.Scanner;
import modul2.LKBangun2D;

public class persegi extends LKBangun2D {
    private double sisi;

    @Override
    public void hitungKeliling() {
        // TODO Auto-generated method stub
        super.hitungKeliling();
        double kl = getSisi()*4;
        setKeliling(kl);
    }

    @Override
    public void hitungLuas() {
        // TODO Auto-generated method stub
        super.hitungLuas();
        double ls = getSisi()*getSisi();
        setLuas(ls);
    }

    @Override
    public void InfoBangun() {
        // TODO Auto-generated method stub
        super.InfoBangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan lebar persegi  : ");
        double z = masuk.nextDouble();
        setSisi(z);

        hitungKeliling();
        hitungLuas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());


    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
