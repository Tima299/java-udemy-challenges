package BasicChallenges;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
        System.out.println(gcd(14, 28));
        System.out.println(gcd(3, 9));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
