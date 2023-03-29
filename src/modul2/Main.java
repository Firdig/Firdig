package modul2;
import java.util.Scanner;
import modul2.bangun2d.*;
import modul2.bangun3d.*;

import java.lang.String;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("MENU:");
            System.out.println("1. Bangun 2D");
            System.out.println("2. Bangun 3D");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitung2D();
                    //  untuk menampilkan daftar bangun 2D dan menghitung volume dan luas permukaan
                    break;
                case 2:
                    hitung3D();
                    //  untuk menampilkan daftar bangun 3D dan menghitung volume dan luas permukaan
                    break;
                case 3:
                    System.out.println("Keluar");

                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while (pilihan != 3);
    }
    public static void hitung2D() {
        int pilihan2d;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("BANGUN 2D:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Kembali ke Menu Utama");
            System.out.print("Pilih: ");
            pilihan2d = input.nextInt();

            switch (pilihan2d) {
                case 1:
                    System.out.println("Anda memilih Persegi");
                    persegi psg = new persegi();
                    psg.InfoBangun();

                    // kode untuk menghitung luas dan keliling persegi
                    break;
                case 2:
                    System.out.println("Anda memilih Persegi Panjang");
                    persegipanjang psgpg = new persegipanjang();
                    psgpg.InfoBangun();

                    // kode untuk menghitung luas dan keliling persegi panjang
                    break;
                case 3:
                    System.out.println("Anda memilih Segitiga");
                    segitiga sgt = new segitiga();
                    sgt.InfoBangun();

                    // kode untuk menghitung luas dan keliling segitiga
                    break;
                case 4:
                    System.out.println("Anda memilih Lingkaran");
                    lingkaran lkr = new lingkaran();
                    lkr.InfoBangun();

                    // kode untuk menghitung luas dan keliling lingkaran
                    break;
                case 5:
                    System.out.println("Anda memilih Jajar Genjang");
                    jajargenjang jgj = new jajargenjang();
                    jgj.InfoBangun();

                    // kode untuk menghitung luas dan keliling jajar genjang
                    break;
                case 6:
                    System.out.println("Anda memilih Belah Ketupat");
                    belahketupat bkt = new belahketupat();
                    bkt.InfoBangun();

                    // kode untuk menghitung luas dan keliling belah ketupat
                    break;
                case 7:
                    System.out.println("Kembali ke Menu Utama");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Apakah Anda ingin mengulang (y/t)? ");
            String ulang = input.next();

            while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t")) {
                System.out.println("Pilihan tidak valid.");
                System.out.print("Apakah Anda ingin mengulang (y/t)? ");
                ulang = input.next();
            }

            if (ulang.equalsIgnoreCase("t")) {
                pilihan2d = 7;
            }
        } while (pilihan2d != 7);
    }

    public static void hitung3D() {
        int pilihan3d;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("BANGUN 3D:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Bola");
            System.out.println("4. Kerucut");
            System.out.println("5. Tabung");
            System.out.println("6. Kembali ke Menu Utama");
            System.out.print("Pilih: ");
            pilihan3d = input.nextInt();

            switch (pilihan3d) {
                case 1:
                    System.out.println("Anda memilih Balok");
                    balok blk = new balok();
                    blk.infoBangun();

                    // kode untuk menghitung luas dan keliling persegi
                    break;
                case 2:
                    System.out.println("Anda memilih Kubus");
                    kubus kbs = new kubus();
                    kbs.infoBangun();

                    // kode untuk menghitung luas dan keliling persegi panjang
                    break;
                case 3:
                    System.out.println("Anda memilih Bola");
                    bola bl = new bola();
                    bl.infoBangun();

                    // kode untuk menghitung luas dan keliling segitiga
                    break;
                case 4:
                    System.out.println("Anda memilih Kerucut");
                    kerucut krct = new kerucut();
                    krct.infoBangun();

                    // kode untuk menghitung luas dan keliling lingkaran
                    break;
                case 5:
                    System.out.println("Anda memilih Jajar Tabung");
                    tabung tbg = new tabung();
                    tbg.infoBangun();

                    // kode untuk menghitung luas dan keliling jajar genjang
                    break;
                case 6:
                    System.out.println("Kembali ke Menu Utama");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Apakah Anda ingin mengulang (y/t)? ");
            String ulang = input.next();

            while (!ulang.equalsIgnoreCase("y") && !ulang.equalsIgnoreCase("t")) {
                System.out.println("Pilihan tidak valid.");
                System.out.print("Apakah Anda ingin mengulang (y/t)? ");
                ulang = input.next();
            }

            if (ulang.equalsIgnoreCase("t")) {
                pilihan3d = 6;
            }
        } while (pilihan3d != 6);
    }
}