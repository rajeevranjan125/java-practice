package ibm;

public class ReverseANumber {
    public static void main(String[] args) {

        System.out.println(reverseWhile(5646));

    }

    public static int reverseWhile(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;           // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            num = num / 10;                  // Remove last digit
        }

        return reversed;
    }
}
// 6745%10 =5 -> 6745/10=674


//rem =5,4,7
