public class MissingNmuber
{
    //Used to  calculate sum of n numbers

    static int sumOfNnumbers(int n)
    {
        int sum = (n * (n+1))/ 2;

        return sum;
    }

    //used to calculate sum of all elements of array

    static int sumOfElements(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int n = 8;

        int[] a = {2, 4, 5, 3, 7, 8, 6};



        int sumOfNnumbers = sumOfNnumbers(n);



        int sumOfElements = sumOfElements(a);



        int missingNumber = sumOfNnumbers - sumOfElements;

        System.out.println("Missing Number is = "+missingNumber);
    }
}