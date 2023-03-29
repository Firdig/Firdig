package modul2.bangun2d;
import modul2.LKBangun2D;

import java.util.Scanner;

public class segitiga extends LKBangun2D {

    private double alas;
    private double tinggi;

    @Override
    public void hitungKeliling() {
        // TODO Auto-generated method stub
        super.hitungKeliling();
        double sisi =2*(0.5*getAlas()*getTinggi())/getAlas();
        double kl = sisi*3;
        setKeliling(kl);
    }

    @Override
    public void hitungLuas() {
        // TODO Auto-generated method stub
        super.hitungLuas();
        double ls = 0.5*getAlas()*getTinggi();
        setLuas(ls);
    }

    @Override
    public void InfoBangun() {
        // TODO Auto-generated method stub
        super.InfoBangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Alas Segitiga : ");
        double z = masuk.nextDouble();
        setAlas(z);
        System.out.print("Masukkan Tinggi Segitiga : ");
        double x = masuk.nextDouble();
        setTinggi(x);

        hitungKeliling();
        hitungLuas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());


    }

    public double getAlas() {
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
}
