package week2;
import java.util.*;

public class no1 {
    public static int LinSrch(char[] data, char key) {
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key)
                jumlah++;
        }
        return jumlah;
    }

    public static int[] CariIndex(char arr[], char k) {
        List<Integer> indeksList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                indeksList.add(i);
            }
        }

        int[] indeksArray = new int[indeksList.size()];
        for (int q = 0; q < indeksList.size(); q++) {
            indeksArray[q] = indeksList.get(q);
        }
        return indeksArray;
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan karakter yang akan dicari : ");
        char key = input1.next().charAt(0);
        char[] data = {'A', 'B', 'C', 'E', 'F', 'B', 'A', 'D', 'G', 'F'};
        int jumlah = LinSrch(data, key);
        int[] indeksArray = CariIndex(data, key);

        System.out.println("Karakter " + key + " sebanyak " + jumlah + " kali.");
        if (indeksArray.length > 0) {
            System.out.print("Karakter " + key + " ditemukan pada indeks: ");
            for (int i = 0; i < indeksArray.length; i++) {
                System.out.print(indeksArray[i]);
                if (i < indeksArray.length - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.print("Karakter " + key + " tidak ditemukan dalam array.");
        }
    }
}
