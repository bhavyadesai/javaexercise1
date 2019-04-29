import java.util.Scanner;
 public class Program4
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
         int input=sc.nextInt();

        for(int i=1;i<=input;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }
    }
}