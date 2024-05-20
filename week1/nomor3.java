package week1;
import java.util.Scanner;
public class nomor3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan bilangan integer : ");
        int input1 = x.nextInt();

        for(int i = 0;i < input1;i++){
            System.out.print("*");
            for(int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}