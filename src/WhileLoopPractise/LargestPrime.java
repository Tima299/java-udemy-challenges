package WhileLoopPractise;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }
    public static int getLargestPrime(int number){
        if(number<0){
            return -1;
        }
        int reserve = 0;
        for (int i = 1; i<=number; i++) {
            if(number%i==0){
                if(isPrime(i) && reserve<i){
                    reserve = i;
                }
            }
        }
        return reserve;
    }
    public static boolean isPrime(int number){
        if(number<0){
            return false;
        }
        int count = 0;
        for (int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        return count == 2;
    }
}
