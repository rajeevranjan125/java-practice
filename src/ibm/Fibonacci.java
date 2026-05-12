package ibm;

public class Fibonacci {
    public static void main(String[] args) {


        System.out.println(fib(6));

    }

    private static int fib(int n) {
        if(n==1 || n==0){ //base condition
            return  n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}

//0,1,1,2,3,5,8

// 0,1,1,2,3,5,8... //fibonacci sequence
// I/p: n=6
//O/p: 8
//
//
//
//
//
//
//
//
//
//
//
//
//
