/**
 * Filename: UpahPerJam.java
 * @author Andrian Fadhilla (NPM: 109220640085)
 */
public class UpahPerJam {

    public static void main(String[] args) throws Exception {
        int upj = 0, gol = 1;

        System.out.println(); // Give some space
        System.out.println("Program untuk menghitung upah per-jam");
        System.out.println("=====================================");
        System.out.println("Jumlah gol : " + gol);
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
