package week1;
import java.util.Scanner;
public class nomor1 {
    public static int fibMethod(int suku){
        if(suku == 0 || suku == 1){
            return 1;
        }
        return fibMethod(suku - 1) + fibMethod(suku - 2);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan banyaknya suku bilangan fibonacci : ");
        int suku = x.nextInt();
        int iterasi = 0;
        while(iterasi < suku){
            System.out.print(fibMethod(iterasi)+", ");
            iterasi++;
        }
    }
}