// task is to merge two arrays and concatenate and add them in a new array


import java.io.*;

public class mergearrays {
    public static void main(String[] args)
    {


        int a[] = { 12,23,34 };

        int b[] = { 24,35,46,57,34};


        int a1 = a.length;

        int b1 = b.length;


        int c1 = a1 + b1;

        // create new array for store them two
        int[] c = new int[c1];


        for (int i = 0; i < a1; i = i + 1) {

            c[i] = a[i];
        }

        // used loop for concatenate them in new array
        for (int i = 0; i < b1; i = i + 1) {


            c[a1 + i] = b[i];
        }

        // for printing just after merging
        for (int i = 0; i < c1; i = i + 1) {

            // print the element
            System.out.println(c[i]);
        }
    }
}
