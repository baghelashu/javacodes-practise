// swap two numbers without using third variable


public class swap {
    public static void main( String[] args){

        int a=12;
        int b=23;

        System.out.println("before swap a is"+ a+ "and b before swap is"+ b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swap a is "+ a +"b after swap b is"+b);





    }


}
