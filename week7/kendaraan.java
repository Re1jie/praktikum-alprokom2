package week7;

public class kendaraan {
    private String warna;
    private String bahanBakar;
    private int kapasitasMuatan;

    //Kontruktornya mas
    public kendaraan (String wn, String bb, int km){
        warna = wn;
        bahanBakar = bb;
        kapasitasMuatan = km;
    }
    public void inpo(){
        System.out.println("Infokan warna = "+warna);
        System.out.println("Infokan bahan bakar = "+bahanBakar);
        System.out.println("Infokan kapasitas muatan = "+kapasitasMuatan);
    }

}
