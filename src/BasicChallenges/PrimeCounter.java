package BasicChallenges;

public class PrimeCounter {
    public static void main(String[] args) {
        System.out.println(countPrimeNumbers(7));
        System.out.println(countPrimeNumbers(10));
        System.out.println(countPrimeNumbers(20));
    }

    public static int countPrimeNumbers(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
