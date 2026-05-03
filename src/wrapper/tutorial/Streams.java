package wrapper.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

    }
}
