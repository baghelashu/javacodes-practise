// just implement linear search code
class LinearSearch {

    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) // start searching element
                return i;
        }
        return -1;

    }

    public static void main(String[] args)
    {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length; //for dealing with array length

        int x = 4;

        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Element not present ");
        else
            System.out.println("Element found " + index);
    }
}
