import java.util.Scanner;

/**
 * Filename: Soal5.java
 * @author Andrian Fadhilla
 */
public class Soal5 {

  static void cetak(String message, Boolean newLine) {
    if (newLine) {
      System.out.println(message);
    } else {
      System.out.print(message);
    }
  }

  public static void main(String[] args) {
    double fahrenheit, celcius;

    cetak("Program untuk mengonversi suhu celcius ke fahrenheit", true);
    cetak("====================================================", true);

    try (Scanner dScanner = new Scanner(System.in)) {
      cetak("Masukkan suhu celcius : ", false);
      celcius = dScanner.nextDouble();
    }

    /**
     * Rumus: F = (9/5 x suhu celcius) + 32
     *          = (1.8 x suhu celcius) + 32
     */
    fahrenheit = (1.8 * celcius) + 32;

    cetak("Suhu fahrenheit : " + fahrenheit, true);
  }
}
