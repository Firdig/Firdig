package modul3codelab;
import java.lang.String;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ModulPractice3 {
    private double value;

    public double setValue(double value,String params){
        if(params.equals("yard")){
            this.value = value;
        }
        else {
            System.out.println("Masukkan parameter Yard");
        }
        return this.value;
    }
    public  double getValue(){
        return this.value;
    }
    public static void main(String[] args) {
            int pilih;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("yard converter to m, cm, feet & miles");
            System.out.println("1. Yard to M");
            System.out.println("2. Yard to CM");
            System.out.println("3. Yard to Feet");
            System.out.println("4. Yard to Miles");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan : ");

            pilih = input.nextInt();
            ModulPractice3 mp = new ModulPractice3();
            Converter c = new Converter();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Yard : ");
                    double x = input.nextInt();
                    mp.setValue(x, "yard");
                    System.out.println(x + " yards = " + c.setValuetoM(x) + " Meters");
                    break;
                case 2:
                    System.out.print("Masukkan Yard : ");
                    double y = input.nextInt();
                    mp.setValue(y, "yard");
                    System.out.println(y + " yards = " + c.setValuetoCM(y) + " Centimeters");
                    break;
                case 3:
                    System.out.print("Masukkan Yard : ");
                    double z = input.nextInt();
                    mp.setValue(z, "yard");
                    System.out.println(z + " yards = " + c.setValuetoFeet(z) + " Feets");
                    break;
                case 4:
                    System.out.print("Masukkan Yard : ");
                    double h = input.nextInt();
                    mp.setValue(h, "yard");
                    System.out.println(h + " yards = " + c.setValuetoMiles(h) + " Miles");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada,pilih lagi");
            }
         } while (pilih !=5);
        }
    }
