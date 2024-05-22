package week8;

public class mobil extends kendaraan {
    private String nama;
    private String jenis;

    public mobil(String nama){
        super("Mobil");
        this.nama=nama;
        jenis="belum teridentifikasi";
    }

    public mobil(String nama, String jenis) {
        super("Mobil");
        this.nama=nama;
        this.jenis=jenis;
    }

    @Override
    public void informasi(){
        System.out.println("Nama pesawat adalah "+nama);
        System.out.println("Jenis pesawat adalah "+jenis);
    }
    
}
