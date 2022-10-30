import java.util.Scanner;

/**
 * Filename: UpahPerJam.java
 * @author Andrian Fadhilla (NPM: 109220640085)
 */
public class UpahPerJam {

    public static void main(String[] args) throws Exception {
        int upj = 0, gol;

        System.out.println(); // Give some space
        System.out.println("Program untuk menghitung upah per-jam");
        System.out.println("=====================================");

        try (Scanner dScanner = new Scanner(System.in)) {
            System.out.print("Jumlah gol : ");
            gol = dScanner.nextInt();
        }

        System.out.println(); // Give some space

        // Condition
        if (gol == 1) {
            upj = 150000;
        } else if (gol == 2) {
            upj = 120000;
        }

        System.out.println("Upah per-jamnya adalah " + upj);
    }
}
