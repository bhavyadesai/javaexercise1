import java.util.Scanner;

public class Program8 {
    public static void main(String args[]) {
        System.out.println("Enter a guess number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= 1 && input <= 50)
        {
            System.out.println("number guessed is matches the original number");
        }

            else if (input < 1)
            {
                System.out.println("number guessed is less than the original number");
            }
            else
                {
                System.out.println("number guessed is more than the original number");
                }



    }
}