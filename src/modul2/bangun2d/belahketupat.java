package modul2.bangun2d;

import modul2.LKBangun2D;

import java.util.Scanner;

public class belahketupat extends LKBangun2D {
    private double d1;
    private double d2;
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
        double ls = getD1()*getD2()/2;
        setLuas(ls);
    }

    @Override
    public void InfoBangun() {
        // TODO Auto-generated method stub
        super.InfoBangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Diagonal 1 Belahketupat : ");
        double z = masuk.nextDouble();
        setD1(z);
        System.out.print("Masukkan Diagonal 2 Belahketupat : ");
        double x = masuk.nextDouble();
        setD2(x);
        System.out.print("Masukkan Sisi BelahKetupat : ");
        double y = masuk.nextDouble();
        setSisi(y);


        hitungKeliling();
        hitungLuas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());


    }

    public double getD1() {
        return d1;
    }
    public double getD2(){
        return d2;
    }
    public double getSisi() {
        return sisi;
    }
    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2){
        this.d2 = d2;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
