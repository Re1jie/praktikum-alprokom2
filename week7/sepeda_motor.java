package week7;

public class sepeda_motor extends kendaraan_darat {
    private String merk;
    
    public sepeda_motor(String wn, String bb, int km, int rd, String mk) {
        super(wn, bb, km, rd);
        merk = mk;
        System.out.println("Sepeda Motor Triggered");
    }   
    
    @Override
    public void inpo() {
        super.inpo();
        System.out.println("Infokan merk = "+merk);
    }
    
}
