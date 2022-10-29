/**
 * Filename: LightSwitch.java
 * @author Andrian Fadhilla (NPM: 109220640085)
 */
public class LightSwitch1 {

    public static void main(String[] args) throws Exception {
        int saklar = 1;
        String lampu;

        System.out.println(); // Give some space
        System.out.println("Program untuk mematikan dan menyalakan lampu");
        System.out.println("============================================");
        System.out.println("Ketik 0 untuk mematikan lampu");
        System.out.println("Ketik 1 untuk menyalakan lampu");
        System.out.println("============================================");
        System.out.println(); // Give some space

        // Condition
        if (saklar == 0) {
            lampu = "\"Mati\"";
        } else {
            lampu = "\"Terang\"";
        }

        System.out.println("Lampu = " + lampu);
    }
}
