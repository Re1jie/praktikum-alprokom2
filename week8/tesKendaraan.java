package week8;

public class tesKendaraan {
    public static void main(String[] args) {
        kendaraan P;
        pesawat psw = new pesawat("Boeing737", "Pesawat Komersial");
        mobil mbl1 = new mobil("Toyota Kijang", "jeep");
        mobil mbl2 = new mobil("Suzuki Baleno", "Sedan");
        mobil mbl3 = new mobil("VW Combi");
        
        P=psw;
        P.informasi();
        P=mbl1;
        P.informasi();
        P=mbl2;
        P.informasi();
        P=mbl3;
        P.informasi();
    }
}
