import java.util.Scanner;

public class program5
{
    public static void main(String args[])
    {
        int sum=0,n,i;
        System.out.println("Enter  number of inputs");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter inputs");
        Scanner s = new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum=sum+a[i];
        }

        System.out.println("output:" +sum);


    }
}

