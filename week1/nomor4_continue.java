package week1;

public class nomor4_continue {
    //Contoh menggunakan continue
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // Jika i = 2, maka Continue (atau di skip)
            if (i == 2)
                continue;
 
            System.out.print(i + " ");
        }
    }
}