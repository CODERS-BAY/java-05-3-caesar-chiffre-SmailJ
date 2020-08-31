import java.util.*;

public class Unhash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hash = 6;
        String unhash = "";

        System.out.println("Was soll entschlüsselt werden ?");
        String gehasht = sc.nextLine();
        for (int i = 0; i < gehasht.length(); i++) {
            char alphabet = gehasht.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet - hash);
                if (alphabet < 'a') {

                    alphabet = (char) (alphabet - 'a' + 'z' + 1);
                }
                unhash = unhash + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet - hash);


                if (alphabet < 'A') {

                    alphabet = (char) (alphabet - 'A' + 'Z' + 1);
                }
                unhash = unhash + alphabet;
            } else {
                unhash = unhash + alphabet;
            }
        }
        System.out.println("Unlocked: " + unhash);

    }
}
