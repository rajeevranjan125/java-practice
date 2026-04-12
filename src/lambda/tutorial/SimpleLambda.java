package lambda.tutorial;

public class SimpleLambda {
    public static void main(String[] args) {

        // =============================================
        // METHOD 1: WITHOUT LAMBDA - Traditional method
        // =============================================
        System.out.println("=== METHOD 1: TRADITIONAL METHOD ===");
        int result1 = add(5, 3);
        System.out.println("5 + 3 = " + result1);
        System.out.println();

        // =============================================
        // METHOD 2: ANONYMOUS CLASS
        // =============================================
        System.out.println("=== METHOD 2: ANONYMOUS CLASS ===");

        // Creating an anonymous class that implements MathOperation
        MathOperation additionAnonymous = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;  // Implementation right here!
            }
        };

        int result2 = additionAnonymous.operate(5, 3);
        System.out.println("5 + 3 = " + result2);

        int result3 = additionAnonymous.operate(10, 20);
        System.out.println("10 + 20 = " + result3);
        System.out.println();

        // =============================================
        // METHOD 3: LAMBDA EXPRESSION
        // =============================================
        System.out.println("=== METHOD 3: LAMBDA EXPRESSION ===");

        // Lambda is just a shorter way to write the anonymous class!
        MathOperation additionLambda = (a, b) -> a + b;

        int result4 = additionLambda.operate(5, 3);
        System.out.println("5 + 3 = " + result4);

        int result5 = additionLambda.operate(10, 20);
        System.out.println("10 + 20 = " + result5);
        System.out.println();

        // =============================================
        // BONUS: Multiple operations with lambda
        // =============================================
        System.out.println("=== BONUS: DIFFERENT OPERATIONS ===");

        // Subtraction
        MathOperation subtract = (a, b) -> a - b;
        System.out.println("10 - 3 = " + subtract.operate(10, 3));

        // Multiplication
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("5 * 4 = " + multiply.operate(5, 4));

        // Division
        MathOperation divide = (a, b) -> a / b;
        System.out.println("15 / 3 = " + divide.operate(15, 3));

        // Max of two numbers
        MathOperation max = (a, b) -> a > b ? a : b;
        System.out.println("Max of 8 and 5 = " + max.operate(8, 5));
    }

    // Traditional method
    public static int add(int a, int b) {
        return a + b;
    }
}

// Interface needed for lambda and anonymous class
interface MathOperation {
    int operate(int a, int b);
}
