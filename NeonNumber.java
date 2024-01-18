/** first lets see what is neon number --
lets say a neon number is given i.e 9 , lets check which number is neon
 first square the number like 8 so, 8*8 = 64 then did the sum of the squared number i.e is
 6+4 which is equal to 10 means its not equal to 9
 this is the step to check whether the given number is neon or not !


**/


import java.io.*;

class Neon {


    public static boolean checkNeon(int n)
    {
        // squaring the number to be checked
        int square = n * n;

        int sum = 0;

        // if it is positive
        while (square > 0) {

            //   to find remainder
            int r = square % 10;
            sum += r;
            square = square / 10;
        }

        if (sum == n)

            return true; // we can say numbr is true
        else

            return false; // not a neon
    }


    public static void main(String[] args)
    {

        int n = 9;


        if (checkNeon(n))


            System.out.println("Given number is " + n
                    + "  Neon number");
        else

            System.out.println("Given number " + n
                    + " is not a Neon number");
    }
}


