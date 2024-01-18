
import java.util.Scanner;

public class numbercount {

    public static int countdigit(int n){

        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;

        }
        int count=0;
        while(n!=0){
            n=n/10;
            count=count+1;

        }
        return count;

    }
    public static void main(String[] args){
        Scanner scnr=new Scanner(System.in);
        int n= scnr.nextInt();

        System.out.println( n + countdigit(n));

    }


}
