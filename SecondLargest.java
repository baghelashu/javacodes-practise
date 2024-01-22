// this code is for how to find the second largest number in an integer array .




public class SecondLargest {
    static int secondLargest(int[] input) {
        int firstLargest, secondLargest;

        //we are checking first two elements in an input given array

        if (input[0] > input[1]) {


            firstLargest = input[0];

            secondLargest = input[1];
        } else {


            firstLargest = input[1];

            secondLargest = input[0];
        }

        //now lets check remain element

        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {


                secondLargest = firstLargest;

                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

                secondLargest = input[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{47, 51, 32, 45, 68, 56}));

        System.out.println(secondLargest(new int[]{785, 567,782, 890, 452, 909}));


    }
}