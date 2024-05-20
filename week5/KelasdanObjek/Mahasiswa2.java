package week5.KelasdanObjek;

public class Mahasiswa2 {
    String nama, NRP;
    double nilai1;
    double nilai2;

    //method void
    void printIdentitas(){
        System.out.println("Nama    : "+nama);
        System.out.println("NRP     : "+NRP);
    }
    //method non void
    double nilaiAverage(){
        double average = 0.5*(nilai1+nilai2);
        return average;
    }
}
