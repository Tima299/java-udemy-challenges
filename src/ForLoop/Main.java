package ForLoop;

public class Main {
    public static void main(String[] args) {
        for (double i = 7.5; i <= 10.0; i += 0.25) {
            double result = calculateInterest(100, i);
            if (result > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + i + " interest = $" + result);
        }
        int number = 7;
        System.out.println(isPrime(number));
        System.out.println(isPrime(17));
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number!");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number!");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number!");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number!");
        System.out.println("7 is " + (isPrime(7) ? "" : "NOT ") + "a prime number!");
        System.out.println("from 1 to 10 there are " + howMany(10) + " prime numbers");
        System.out.println("from 1 to 100 there are " + howMany(100) + " prime numbers");
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int howMany(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (isPrime(i) == true) {
                count++;
            }
        }
        return count;
    }
}
