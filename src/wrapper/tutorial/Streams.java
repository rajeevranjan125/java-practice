package wrapper.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

       List<Integer> ans = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sorted()
                .toList();
        System.out.println(ans);
    }
}
