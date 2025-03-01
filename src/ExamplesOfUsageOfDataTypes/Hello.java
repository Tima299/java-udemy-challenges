package ExamplesOfUsageOfDataTypes;

public class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, Temur");
        }
        boolean isAlien = false;
        if (isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        } else {
            System.out.println("It is an alien!");
            System.out.println("And I am not scared of aliens");
        }
        int topScore = 80;
        if(topScore < 100 ) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if(isCar == false) {
            System.out.println("This is not supposed to happen");
        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "GM" ? true : false;
        if(isDomestic) {
            System.out.println("This is a domestic car");
        } else {
            System.out.println("This is a foreign car");
        }
        String s = (isDomestic) ? "This is a domestic car" : "This is a foreign car";
        System.out.println(s);
    }
}

