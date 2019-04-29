

import java.util.Scanner;
import java.util.Arrays;

public class program7 {

    public static void main(String[] args) {

        // Integer[] arr = {2, 3, 1, 4, 5};

        // Arrays.sort(arr);

        //for (int i = 0; i < arr.length; i++) {
        //System.out.print(arr[i]);
        //  }

        //String input = "Sameer Aishwarya";
        // String []s1 = input.split(" ");
        //for (String S:s1
        //) {

        //System.out.println(S);

        //}

        // for(int j=0;j<s1.length;j++)
        // {
        //System.out.println(s1[j]);
        // }

        //String[] str1 = {"sa","re","ga","ma"};
        //for (int k=0;k<str1.length;k++)
        //System.out.print(str1[k]);


        //}

        //}


        Scanner input = new Scanner(System.in);

        int number;
        int length;
        int temp;

        System.out.println("Enter a large number :");
        number = input.nextInt();

        int len = Integer.toString(number).length(); // finding length of the number

        int[] numArray = new int[len];
        int k = 0;
        int len1;
        int sum = 0;

        len1 = len;

        while (len > 0) {
            numArray[k] = number % 10;
            number = number / 10;

            if ((numArray[k] % 2) == 0) {
                sum = sum + numArray[k];
            }
            k++;
            len--;
        }

        len = len1;

        int temp1;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (numArray[j] > numArray[j - 1]) {
                    temp1 = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = temp1;
                }
            }
        }

        k = 0;

        System.out.print("Sorted number in non-increasing order: ");

        while (len > 0) {
            System.out.print(numArray[k]);
            len--;
            k++;
        }

        System.out.println("");
        System.out.println("The Sum of even numbers is ... " + sum);
        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}



