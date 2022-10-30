/**
 * Filename: Soal1.java
 * @author Andrian Fadhilla
 */
public class Soal1 {

  static void cetak(String message, Boolean newLine) {
    if (newLine) {
      System.out.println(message);
    } else {
      System.out.print(message);
    }
  }

  public static void main(String[] args) throws Exception {
    cetak("Stmik Pranata Indonesia", true);
    cetak("Jurusan Sistem Informasi", true);
    cetak("Mata Kuliah : Praktek Algoritma & Pemrograman", true);
    cetak("=============================================", true);
  }
}
