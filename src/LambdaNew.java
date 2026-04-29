import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaNew {

    public static void main(String[] args) {

//        Calculatator calculatator = new Addition();

//        Calculatator c = (a, b) -> a / b;
//        print(5, 4, c);

//        Function<Integer, Integer> square = x -> x * x;

//        Consumer<Integer> printNumber = (x)-> System.out.println("the number is "+x );
//
//        printNumber.accept(56);
//
//        Supplier<Double> randomValue = () -> Math.random()*900000 + 100000;
//
//        System.out.println(randomValue.get());

//        Predicate<Integer> evenCheck = x -> x % 2 == 0;
//
//        System.out.println(evenCheck.test(5));


//        System.out.println(square.apply(5));


        List<Integer> lst =new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));

        System.out.println(lst);

    }

//    public static void printSquare(int x, Function<Integer, Integer> square) {
//
//        System.out.println( square.apply(x));
//    }

//    public static void print(int a, int b, Calculatator calculatator) {
//
//
//        System.out.println(calculatator.add(a, b));
//
//    }

}

@FunctionalInterface
interface Calculatator {
    int add(int a, int b);
}

//class Addition implements Calculatator {
//
//    @Override
//    public int add(int a, int b) {
//        return a + b;
//    }
//}


