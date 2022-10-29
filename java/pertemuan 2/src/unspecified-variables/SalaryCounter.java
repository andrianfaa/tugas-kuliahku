/**
 * Filename: SalaryCounter.java
 * @author Andrian Fadhilla (NPM: 109220640085)
 */
public class SalaryCounter {

    public static void main(String[] args) throws Exception {
        int masa_kerja = 24, gaji_pokok = 4800000, gaji, bonus = 0;

        System.out.println(); // Give some space
        System.out.println("Program untuk menghitung gaji seorang karyawan");
        System.out.println("==============================================");
        System.out.println("Gaji pokok : " + gaji_pokok);
        System.out.println("Masa kerja : " + masa_kerja);
        System.out.println("==============================================");

        if (masa_kerja >= 10) {
            bonus = 200000;
        }

        gaji = gaji_pokok + bonus;

        System.out.println("Gaji anda adalah " + gaji);
    }
}
