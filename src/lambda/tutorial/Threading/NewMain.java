package lambda.tutorial.Threading;

public class NewMain {
    public static void main(String[] args) {

        Runnable myWork = new MyWork();

       Thread t1 = new Thread(myWork);

       t1.start();;


       for(;;){
           System.out.println(Thread.currentThread().getName());
           System.out.println(Thread.currentThread().getState());
       }
    }
}
