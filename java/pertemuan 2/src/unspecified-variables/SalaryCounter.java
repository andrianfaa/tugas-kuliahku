import java.util.Scanner;

/**
 * Filename: SalaryCounter.java
 * @author Andrian Fadhilla (NPM: 109220640085)
 */
public class SalaryCounter {

    public static void main(String[] args) throws Exception {
        int masa_kerja, gaji_pokok, gaji, bonus = 0;

        System.out.println(); // Give some space
        System.out.println("Program untuk menghitung gaji seorang karyawan");
        System.out.println("==============================================");

        try (Scanner dScanner = new Scanner(System.in)) {
            System.out.print("Gaji pokok : ");
            gaji_pokok = dScanner.nextInt();

            System.out.print("Masa kerja : ");
            masa_kerja = dScanner.nextInt();
        }

        System.out.println("==============================================");

        if (masa_kerja >= 10) {
            bonus = 200000;
        }

        gaji = gaji_pokok + bonus;

        System.out.println("Gaji anda adalah " + gaji);
    }
}
