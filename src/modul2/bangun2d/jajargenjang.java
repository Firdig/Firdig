package modul2.bangun2d;

import modul2.LKBangun2D;

import java.util.Scanner;

public class jajargenjang extends LKBangun2D {
    private double alas;
    private double tinggi;
    private double miring;

    @Override
    public void hitungKeliling() {
        // TODO Auto-generated method stub
        super.hitungKeliling();
        double kl = 2*(getAlas()+getMiring());
        setKeliling(kl);
    }

    @Override
    public void hitungLuas() {
        // TODO Auto-generated method stub
        super.hitungLuas();
        double ls = getAlas()*getTinggi();
        setLuas(ls);
    }

    @Override
    public void InfoBangun() {
        // TODO Auto-generated method stub
        super.InfoBangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Alas Jajargenjang : ");
        double z = masuk.nextDouble();
        setAlas(z);
        System.out.print("Masukkan Tinggi Jajargenjang : ");
        double x = masuk.nextDouble();
        setTinggi(x);
        System.out.print("Masukkan Miring Jajargenjang : ");
        double y = masuk.nextDouble();
        setMiring(y);


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
    public double getMiring() {
        return miring;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setMiring(double miring) {
        this.miring = miring;
    }
}
