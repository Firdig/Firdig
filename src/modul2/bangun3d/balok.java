package modul2.bangun3d;

import modul2.LKBangun3D;

import java.util.Scanner;

public class balok extends LKBangun3D {
private double panjang;
    private double lebar;
    private double tinggi;
    @Override
    public void hitungVolume(){
    super.hitungVolume();
    double v = getPanjang()*getLebar()*getTinggi();
    setVolume(v);
    }
    @Override
    public void infoBangun(){
    super.infoBangun();
        Scanner input = new Scanner(System.in);
                System.out.print("Masukkan Tinggi Balok : ");
                double z = input.nextDouble();
                setTinggi(z);
                System.out.print("Masukkan Panjang Balok : ");
                double x = input.nextDouble();
                setPanjang(x);
                System.out.print("Masukkan Lebar Balok : ");
                double y = input.nextDouble();
                setLebar(y);

                hitungVolume();

                System.out.println("Volume adalah :" + getVolume());
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public   void setLebar(double lebar){
        this.lebar = lebar;
    }

    private double getTinggi(){
        return tinggi;
    }
    private double getPanjang(){
        return panjang;
    }
    private double getLebar(){
        return lebar;
    }
}
