package lambda.tutorial.Threading;

public class MyWork implements Runnable{

    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
