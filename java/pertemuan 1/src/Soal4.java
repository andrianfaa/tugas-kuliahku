import java.util.Scanner;

/**
 * Filename: Soal4.java
 * @author Andrian Fadhilla
 */
public class Soal4 {

  static void cetak(String message, Boolean newLine) {
    if (newLine) {
      System.out.println(message);
    } else {
      System.out.print(message);
    }
  }

  public static void main(String[] args) throws Exception {
    double luas, phi = 3.14;
    int jari_jari = 0;

    try (Scanner dScanner = new Scanner(System.in)) {
      cetak("Masukkan jari-jari lingkaran : ", false);
      jari_jari = dScanner.nextInt();
    }

    /**
     * Rumus: 3.14 * R^2
     */
    luas = phi * Math.pow(jari_jari, 2);

    cetak("Luas lingkaran : " + luas, true);
  }
}
