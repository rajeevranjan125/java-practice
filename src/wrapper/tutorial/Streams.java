package wrapper.tutorial;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>(Arrays.asList(10, 10, 2, 3, 4, 5, 6, 7));
//
//
//        List<Integer> ans = list.stream()
//                .distinct()
//                .toList();
//
//        List<List<Integer>> list = new ArrayList<>(
//                Arrays.asList(Arrays.asList(2, 10, 2, 3, 4, 5, 6, 7),
//                        Arrays.asList(10, 10, 2, 3, 4, 5, 6, 7))
//        );
//
//        list.stream()
//                .flatMap(x -> x.stream())
//                .forEach(System.out::println);


//      Stream<Integer> stream=  Stream.of(1,2,3);

//      stream.sorted((a,b)->b-a).forEach(System.out::println);

//        System.out.println(ans);
//        List<Integer> ans = list.stream()
//                .filter((x) -> x % 2 == 0)
//                .map(x -> x * 2)
//                .map(x -> x * 5)
//                .sorted()
//                .distinct()
//                .limit(2)
//                .collect(Collectors.toList());

//      Stream<Integer> stream =  Stream.iterate(10,x->x+2);
//
//        System.out.println(stream.limit(10).toList());

//        Stream<Double> streams = Stream.generate(Math::random).map(x -> x * 10000).limit(10);
//
//        streams.forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        numbers.stream()
//                .peek(n -> System.out.println("Original: " + n))
//                .map(n -> n * 2)
//                .peek(n -> System.out.println("After map: " + n))
//                .forEach(System.out::println);


//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//
//        IntStream intStream = stream.mapToInt((x) -> x * x);
//
//        intStream.forEach(System.out::println);

//        Stream<Integer> stream = Stream.of(1,2,3);
//
//        stream.mapToLong(x->x).forEach(System.out::println);
//        int[] arr = new int[]{1, 2, 3};
//        List<int[]> ans = Arrays.asList(arr);  // Returns List<int[]> (not List<Integer>)
//
//        ans.add(0,8);
//
//        ans.forEach(System.out::print);


//        List<Integer> ans = new ArrayList<>(List.of(1,2,3,4));

//        int sum = Stream.of(1, 23).reduce(0,(a, b) -> a + b);
//
//        System.out.println(sum);

//        List<Integer> ans = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//
//        long i = ans.stream()
//                .filter(x -> x % 2 == 0)
//                .count();
//
//        System.out.println(i);

//        List<Integer> ans = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
//
//        Optional<Integer> i = ans.stream()
//                .map(x -> x * 3)
//                .findAny();
//
//        System.out.println(i.get());

//         Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        OptionalInt max = stream.mapToInt(x -> x).max();
//        OptionalInt min = stream.mapToInt(x->x).min();
//        OptionalDouble ave = stream.mapToInt(x->x).average();

//        OptionalInt sum = stream.mapToInt(x->x).max();
//        System.out.println(sum.getAsInt());


//        Runnable mySecondThread = new MySecondThread();

//        Thread thread = new Thread(() -> System.out.println("helllllo world"));
//
//        thread.start();

//        List<Integer> ans = new ArrayList<>(List.of(9, 4, 1, 6, 3, 83));
//
//        ans.sort((a,b)->a-b);
//
//        System.out.println(ans);

//        Runnable r = ()-> System.out.println("hello world");
//
//        r.run();

//        System.out.println("main thread name is: " + Thread.currentThread().getName());
//        System.out.println("main thread id is :" + Thread.currentThread().getId());
//
//        Thread t1 = new Thread(
//                () -> {
//                    System.out.println(" thread name t1 :" + Thread.currentThread().getName());
//                    System.out.println("thread id t2 :" + Thread.currentThread().getId());
//                }
//        );
//
//
//       Thread t2 = new Thread(
//                () -> {
//                    System.out.println("t2 thread name is :" + Thread.currentThread().getName());
//                    System.out.println("t2 thread id is: " + Thread.currentThread().getId());
//                }
//        );
//
//       t1.start();
//       t2.start();
//-----IMPORTANT----:
//-------------------------------------------------------------------------------------------------------------------
        //note 1: start() method tells OS to make new thread and then run() method called by start() method
        //note 2: if you do t1.run() then main thread will call because without start method,
        // thread will not make by OS so it called the current thread which is main thread
// -------------------------------------------------------------------------------------------------------------------

//-----IMPORTANT----:
//       Thread t1= new Thread(
//                ()->{
//                    System.out.println("first thread");
//                }
//        );
//
//       t1.start();
////       t1.start(); cannot start() same thread twice


    }
}

//class MyThread extends Thread {
//
//
//    @Override
//    public void run() {
//        System.out.println("hey");
//    }
//}
class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("hey");
    }
}
class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("hey");
    }
}

//class MySecondThread implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("hello");
//    }
//}
