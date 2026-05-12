package ibm;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(-1));

    }

    private static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
}

//factorial(5) = 5*4*3*2*1 = 120
