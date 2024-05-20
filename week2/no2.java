package week2;

public class no2 {
    public static int pencarianBinary(char[] data, char key) {
        int bawah = 0;
        int atas = data.length - 1;

        while (atas >= bawah) {
            int tengah = (bawah + atas) / 2;

            if (key == data[tengah]) {
                return (tengah + 1);
            } else if (key < data[tengah]) {
                atas = tengah - 1;
            } else
                bawah = tengah + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        char[] data = {'a', 'c', 'e', 'g', 'g', 'i', 'k', 'o', 'q', 'r'};
        char key = 'r';
        int indeks = pencarianBinary(data, key);

        if (indeks != 0) {
            System.out.println("Karakter '" + key + "' berada pada indeks ke-" + (indeks - 1));
        } else {
            System.out.println("Karakter '" + key + "' tidak ditemukan ");
        }
    }
}
