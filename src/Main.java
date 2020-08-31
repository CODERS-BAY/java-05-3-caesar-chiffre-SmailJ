import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hash = 6;
        String locked = "";
        String unlocked = "";

        System.out.println("Was soll verschlüsselt werden ?");
        String blank = sc.nextLine();
        char alphabet;

        for (int i = 0; i < blank.length(); i++) {
            alphabet = blank.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + hash);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                locked = locked + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + hash);

                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                locked = locked + alphabet;
            } else {
                locked = locked + alphabet;
            }
        }
        System.out.println("geHasht: " + locked);
    }

}
