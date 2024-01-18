// just copying one array to another array


public class Arrayscopying {

    public static void main(String[] args)
    {

        int a[] = { 1, 8, 3 };

        int b[] = new int[a.length];// here we create an array b with same size


        for (int i = 0; i < a.length; i++) // just copying an elements
            b[i] = a[i];
        b[0]++; // with this help change 1st element just for make differ


        System.out.println("Elements of a[] ");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");


        System.out.println("\n\nElements of b[] ");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
