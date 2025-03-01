package WhileLoopPractise;

public class digitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(12345));
        System.out.println(sumFirstAndLastDigit(123456));

    }

    public static int sumDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int original = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return original == reverse;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }


}

