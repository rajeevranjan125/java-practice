package wrapper.tutorial;

public class WrapperClass {

    public static void main(String[] args) {

        try {

            throw new MyException("my own exception");
        } catch (Throwable e) {

            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }
    }

    static class MyException extends Throwable {

        public MyException(String message) throws Exception {

            super(message);
        }
    }
}