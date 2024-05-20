package week1;

public class nomor4_break {
    //Contoh kasus loop dengan break
    public static void main(String[] args){
        // Loop inisiasi i dari 0 hingga 100
        for (int i = 0; i <= 100; i++) {
            // Menghentikan loop disaat i = 5
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    }
}