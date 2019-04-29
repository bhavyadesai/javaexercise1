
import java.util.Scanner;
public class Program3 {
    public static void main(String args[]) {
        String s;
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Given entered string is an vowel");
            } else {
                System.out.println("Given entered string is a consonant");
            }
        }
    }
}
