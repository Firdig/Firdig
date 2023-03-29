package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class persegipanjang extends LKBangun2D {
    private double panjang;
    private double lebar;

    @Override
    public void hitungKeliling() {
        // TODO Auto-generated method stub
        super.hitungKeliling();
        double kl = ((getLebar()*2)+(getPanjang()*2));
        setKeliling(kl);
    }

    @Override
    public void hitungLuas() {
        // TODO Auto-generated method stub
        super.hitungLuas();
        double ls = getPanjang()*getLebar();
        setLuas(ls);
    }

    @Override
    public void InfoBangun() {
        // TODO Auto-generated method stub
        super.InfoBangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan lebar persegi panjang : ");
        double z = masuk.nextDouble();
        setLebar(z);
        System.out.print("Masukkan panjang persegi panjang : ");
        double x = masuk.nextDouble();
        setPanjang(x);

        hitungKeliling();
        hitungLuas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());


    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
