package WhileLoopPractise;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        int count =0;
        int totalEven =0;
        int totalOdd =0;
        while (num <= 20) {
//            System.out.println(num + " is"+(isEvenNumber(num)?" ":" not ")+"even number!");
            if (isEvenNumber(num)) {
                System.out.println(num + " is even number!");
                count++;
                totalEven++;
                if(count==5){
                    break;
                }
            }
            if(isEvenNumber(num)==false){
                totalOdd++;
            }
            num++;
        }
        System.out.println("Total number of even numbers in this range is : "+ totalEven);
        System.out.println("Total number of odd numbers in this range is : "+ totalOdd);
    }

    public static boolean isEvenNumber(int e) {
        return e % 2 == 0;
    }
}
