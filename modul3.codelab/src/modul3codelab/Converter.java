package modul3codelab;

public class Converter {
    protected double setValuetoM(double val){
        double hasil;
        double meter = 0.9144;
        hasil = val * meter;
        return hasil;
    }
    protected double setValuetoCM(double val){
        double hasil;
        double meter = 91.44 ;
        hasil = val * meter;
        return hasil;
    }
    protected double setValuetoFeet(double val){
        double hasil;
        double meter = 3;
        hasil = val * meter;
        return hasil;
    }
    protected double setValuetoMiles(double val){
        double hasil;
        double meter = 0.000568182;
        hasil = val * meter;
        return hasil;
    }

}
