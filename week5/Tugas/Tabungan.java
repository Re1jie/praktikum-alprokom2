package week5.Tugas;

public class Tabungan {
    public int saldo;
    public Tabungan(int initSaldo){
        saldo = initSaldo;
        System.out.println("Saldo awal : " + saldo);
    }
    public int getSaldo(){
        return saldo;
        
    }
    public void simpanUang(int jumlah){
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Jumlah uang yang disimpan : " + jumlah);
        }
    }
    public void ambilUang(int jumlah){
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Jumlah uang yang diambil : " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        
    }
    public void transfer(Tabungan tabungan, int jumlah){
        if (saldo >= jumlah) {
            saldo -= jumlah;
            tabungan.saldo += jumlah;
            System.out.println("Transfer sebesar " + jumlah + " berhasil dilakukan dari Tabungan 1 ke Tabungan 2.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk melakukan transfer.");
        }
    }
    }
    
