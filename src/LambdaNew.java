public class LambdaNew {

    public static void main(String[] args) {

//        Calculatator calculatator = new Addition();

        print(5, 6, (a, b) -> a+b);
    }

    public static void print(int a, int b, Calculatator calculatator) {

        System.out.println(calculatator.add(a, b));
    }

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


