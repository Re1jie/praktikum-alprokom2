package week7;

public class perahu_layar extends kendaraan_laut{
    private int jumlahlayar;

    perahu_layar(String wn, String bb, int km, String jj, int jl) {
        super(wn, bb, km, jj);
        jumlahlayar = jl;
    }

    @Override
    public void inpo() {
        super.inpo();
        System.out.println("Infokan jumlah layar = "+jumlahlayar);
    }
}
