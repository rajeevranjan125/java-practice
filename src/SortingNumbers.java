import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNumbers {
    public static void main(String[] args) {

        Integer[] numbers = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // =============================================
        // METHOD 1: WITHOUT LAMBDA (Traditional way)
        // =============================================
        System.out.println("=== WITHOUT LAMBDA ===");

        Integer[] nums1 = numbers.clone();  // Make a copy

        // Using anonymous class
        Arrays.sort(nums1, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;  // a - b means ascending order
                // If a < b → negative → a comes before b
                // If a = b → zero → equal
                // If a > b → positive → a comes after b
            }
        });

        System.out.println("Sorted ascending: " + Arrays.toString(nums1));

        // =============================================
        // METHOD 2: WITH LAMBDA
        // =============================================
        System.out.println("\n=== WITH LAMBDA ===");

        Integer[] nums2 = numbers.clone();

        // Lambda version - ONE LINE!
        Arrays.sort(nums2, (a, b) -> a - b);

        System.out.println("Sorted ascending: " + Arrays.toString(nums2));

        // =============================================
        // Descending order
        // =============================================
        System.out.println("\n=== DESCENDING ORDER ===");

        Integer[] nums3 = numbers.clone();

        // Without lambda
        Arrays.sort(nums3, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;  // b - a means descending
            }
        });
        System.out.println("Without lambda (desc): " + Arrays.toString(nums3));

        // With lambda
        Integer[] nums4 = numbers.clone();
        Arrays.sort(nums4, (a, b) -> b - a);
        System.out.println("With lambda (desc):    " + Arrays.toString(nums4));
    }
}