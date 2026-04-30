import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaPractice {

    public static void main(String[] args) {

//        Convert integer to its square string
//        Input: 5 → Output: "Square is 25"

        Function<Integer, String> square = x -> String.valueOf(x * x);

//        System.out.println(square.apply(5));

//        Print each element of a list
//
//        Input: ["Java", "Spring", "Backend"]
//        Output:
//        Java
//        Spring
//        Backend

        List<String> arr = new ArrayList<>(List.of("Java", "Spring", "Backend"));

        arr.forEach(System.out::println);

//       Generate a random 6-digit OTP

        Supplier<Integer> otp = () -> (int) Math.floor(Math.random() * 900000 + 100000);

        System.out.println(otp.get());


//        Check if a number is even

        Predicate<Integer> checkEven = (x) -> x % 2 == 0;

        System.out.println(checkEven.test(55));
    }
}
