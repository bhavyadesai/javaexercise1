
public class Program1
  {

    public static void main(String[] args) {



        int num = 2468642, givenum, sum = 0, rem = 0, sum1 = 0;

        givenum=num;

        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
            if(rem%2==0)
            {
                sum1=sum1+rem;
            }
        }
        if(sum==givenum)
        {
            System.out.println("it is a palindrome");
            if(sum1>25)
            {
                System.out.println("and sum of numbers are greater than 25");
            }
            else
            {
                System.out.println("and sum of numbers are greater than 25");

            }
        }
        else
        {
            System.out.println("it is a palindrome");

        }
    }
}