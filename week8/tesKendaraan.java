package week8;

public class tesKendaraan {
    public static void main(String[] args) {
        kendaraan psw = new pesawat("Boeing737", "Pesawat Komersial");
        kendaraan mbl1 = new mobil("Toyota Kijang", "jeep");
        kendaraan mbl2 = new mobil("Suzuki Baleno", "Sedan");
        kendaraan mbl3 = new mobil("VW Combi");
        
        psw.informasi();
        mbl1.informasi();
        mbl2.informasi();
        mbl3.informasi();

    }
}
