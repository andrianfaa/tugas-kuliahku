/**
 * Filename: Soal2.java
 * @author Andrian Fadhilla
 */
public class Soal2 {

  static void cetak(String message, Boolean newLine) {
    if (newLine) {
      System.out.println(message);
    } else {
      System.out.print(message);
    }
  }

  public static void main(String[] args) {
    String bhs = "Bahasa";
    String program = "Java Jcreator";

    cetak(bhs, true);
    cetak(program, true);
    cetak("==============", true);
    cetak(bhs + " " + program, true);
  }
}
