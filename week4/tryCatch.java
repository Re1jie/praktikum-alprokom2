package week4;
import java.util.Arrays;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        int[] arrayGw = {1, 2};
        System.out.println("Array kondisi awal: ");
        System.out.println(Arrays.toString(arrayGw));
        
        try {
            Scanner x = new Scanner(System.in);
            System.out.print("Masukkan angka yang mau dimasukkan ke dalam array: ");
            int tambahkan = x.nextInt();
            int[] arrayBaru = new int[arrayGw.length + 1];
            for (int i = 0; i < arrayBaru.length; i++) {
                if (i < 1) {
                    arrayBaru[i] = arrayGw[i];
                } else if (i == 1) {
                    arrayBaru[i] = tambahkan;
                } else {
                    arrayBaru[i] = arrayGw[i - 1];
                }
            }  
            arrayGw = arrayBaru;  
            System.out.println("Array setelah ditambah '"+tambahkan+"' di index 1: ");
            System.out.println(Arrays.toString(arrayBaru));

        } catch (Exception e){
            System.out.println("Terjadi error, masukkan inputan yang benar");
        } finally {
            System.out.println("Blok finally, program selesai");
        }
    }
}
