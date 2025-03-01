package ReadingUserInput;

import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter number #"+i);
            try {
                number = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please enter in proper format only!");
            }
            if(isValid(number)){
                sum+=number;
            }
        }
        System.out.println("The sum of these numbers is "+sum);
    }
    public static boolean isValid(Double number){
        if(number<0){
            return  false;
        }
        return true;
    }
}
