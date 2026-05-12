package ibm;

public class SwapNumber {

    public static void main(String[] args) {
        int a =6;
        int b =5;

        int t =a;
        a=b;
        b=t;

        //t=6
        //a=5
        //b=6
        System.out.println(a);
        System.out.println(b);
    }
}
