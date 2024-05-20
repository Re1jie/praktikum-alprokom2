package week7;

public class tesKendaraan {
    public static void main(String[] args) {
        System.out.println("MOTOR IDAMAN");
        sepeda_motor mantab = new sepeda_motor("Pink", "hidrogen", 69, 2, "Smasnug");
        mantab.inpo();

        System.out.println("");

        System.out.println("KAPAL KU");
        perahu_layar keren = new perahu_layar("hitam legam", "listrik", 420, "jangkar bawaan", 1);
        keren.inpo();
    }
}
