package ExamplesOfUsageOfDataTypes;
public class Challenge {
    public static void main(String[] args) {
        double dVal = 20.00d;
        double second_D_Val = 80.00d;
        double result = (dVal + second_D_Val) * 100.00d;
        System.out.println("My values total = " + result);
        double rem = result % 40.00d;
        System.out.println("Remainder = " + rem);
        boolean bVar = (rem == 0.00) ? true : false;
        System.out.println("The result is : " + bVar);
        if (bVar == false) {
            System.out.println("Got some remainder!");
        }
    }
}

