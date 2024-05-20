package week5.KelasdanObjek;

public class ImplementasiKelasMahasiswa {
    public static void main(String[] args) {
            //bikin obj baru dgn nama Fikri
    Mahasiswa Fikri = new Mahasiswa();
    Fikri.nama = "Fikri Ramadhan";
    Fikri.NRP = "5002221001";
    Fikri.jurusan = "Matematika";
    Fikri.semester = 4;
    
    System.out.println("Nama     : "+Fikri.nama);
    System.out.println("NRP      : "+Fikri.NRP);
    System.out.println("Jurusan  : "+Fikri.jurusan);
    System.out.println("Semester : "+Fikri.semester);

    Mahasiswa2 Bagas = new Mahasiswa2();
    Bagas.nama = "Bagasetya Dwiki";
    Bagas.NRP = "5002211087";
    Bagas.nilai1 = 100.0;
    Bagas.nilai2 = 70.0;

    Bagas.printIdentitas();
    double nilaiBagas = Bagas.nilaiAverage();
    System.out.println("Nilai rata-rata Bagas : "+nilaiBagas);
    }
}
