import java.util.Scanner;

/**
 * Filename: Soal3.java
 * @author Andrian Fadhilla
 */
public class Soal3 {

  static void cetak(String message, Boolean newLine) {
    if (newLine) {
      System.out.println(message);
    } else {
      System.out.print(message);
    }
  }

  public static void main(String[] args) throws Exception {
    int alas, tinggi;
    double phi = 3.14, luas;

    try (Scanner dScanner = new Scanner(System.in)) {
      cetak("Masukkan alas segitiga : ", false);
      alas = dScanner.nextInt();

      cetak("Masukkan tinggi segitiga : ", false);
      tinggi = dScanner.nextInt();
    }

    /**
     * Rumus: 3.14 x alas x tinggi
     */
    luas = phi * alas * tinggi;

    cetak("Luas = " + luas, true);
  }
}
