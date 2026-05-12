package ibm;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrong(123));
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Find number of digits
        int digits = String.valueOf(num).length();

        // Calculate sum of digits raised to power
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        return sum == originalNum;
    }
}
