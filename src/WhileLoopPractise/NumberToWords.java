package WhileLoopPractise;

public class NumberToWords {
    public static void main(String[] args) {

        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);
        System.out.println();
        numberToWords(0);
        System.out.println();
        numberToWords(1234);
        System.out.println();
        numberToWords(100);
        System.out.println();
        numberToWords(101);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(10000);
        System.out.println();
        numberToWords(100000);
        System.out.println();
        numberToWords(1000000);
        System.out.println();
        numberToWords(10000000);
        System.out.println();
        numberToWords(100000000);
        System.out.println();
        numberToWords(1000000000);
        System.out.println();
        numberToWords(1000000001);
        System.out.println();
        numberToWords(1000000010);
        System.out.println();
        numberToWords(1000000100);
        System.out.println();
        numberToWords(1000001000);
        System.out.println();
        numberToWords(1000010000);
        System.out.println();
        numberToWords(1000100000);
        System.out.println();
        numberToWords(1001000000);
        System.out.println();
        numberToWords(1010000000);
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
            return;
        }
        int last = 0;
        while(number>0){
            last = reverse(number) % 10;
            number/=10;
        }
        switch (last){
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
        }
        System.out.print(last);
    }
    public static int reverse(int number){
        int revers = 0;
        while(number>0){
            int digit = number % 10;
            revers = revers * 10 + digit;
            number/=10;
        }
        return revers;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
}