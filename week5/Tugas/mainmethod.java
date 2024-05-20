package week5.Tugas;

public class mainmethod {
    public static void main(String[] args) {
        //inisialisasi saldo awal di tabungan 1
        Tabungan tabungan1 = new Tabungan(5000);

        //operasi saldo
        tabungan1.simpanUang(3000);
        tabungan1.ambilUang(6000);
        tabungan1.simpanUang(3500);
        tabungan1.ambilUang(4000);
        tabungan1.ambilUang(1600);
        tabungan1.simpanUang(2000);

        System.out.println("Saldo tabungan1 : "+tabungan1.getSaldo());

        // inisialisasi saldo awal di tabungan 2
        Tabungan tabungan2 = new Tabungan(2000);
        
        tabungan1.transfer(tabungan2, 2000);
        System.out.println("Saldo sekarang di Tabungan 1 : " + tabungan1.getSaldo());
        System.out.println("Saldo sekarang di Tabungan 2 : " + tabungan2.getSaldo());
    }
}
