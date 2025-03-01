package methodChallenge;

public class Challenge1 {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was not 1 or 2");
        }
        String month = "January";
        System.out.println(getQuarter(month));
        month = "April";
        System.out.println(getQuarter(month));
        month = "July";
        System.out.println(getQuarter(month));
        month = ("october");
        System.out.println(getQuarter(month));
        month = "Invalid";
        System.out.println(getQuarter(month));
        System.out.println(nato('A'));
        System.out.println(nato('B'));
        System.out.println(nato('C'));
        System.out.println(nato('D'));
        System.out.println(nato('E'));
        System.out.println(nato('F'));
        System.out.println(printWeekDay(0));
        System.out.println(printWeekDay(1));
        System.out.println(printWeekDay(2));
        System.out.println(printWeekDay(3));
        System.out.println(printWeekDay(4));
        System.out.println(printWeekDay(5));
        System.out.println(printWeekDay(6));
        System.out.println(printWeekDay(7));
        System.out.println(bonus(1));
        System.out.println(bonus(2));
        System.out.println(bonus(3));
        System.out.println(bonus(4));
        System.out.println(bonus(5));
        System.out.println(bonus(6));
        System.out.println(bonus(7));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> {
                yield "First quarter";
            }
            case "April", "May", "June" -> "Second quarter";
            case "July", "August", "September" -> "Third quarter";
            case "October", "November", "December" -> "Fourth quarter";
            default -> {
                String badResponse = month + " is not a valid month";
                yield badResponse;
            }
        };
    }

    public static String nato(char charValue) {
        switch (charValue) {
            case 'A': {
                return "Able";
            }
            case 'B': {
                return "Baker";
            }
            case 'C': {
                return "Charlie";
            }
            case 'D': {
                return "Dog";
            }
            case 'E': {
                return "Easy";
            }
            default: {
                return "Invalid Type";
            }
        }
    }
    public static String printWeekDay(int num){
        return switch (num){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String r =  num + " is not day of the week";
                yield r;
            }
        };
    }
    public static String bonus(int numeric){
        if(numeric==0){
            return "Sunday";
        }else if(numeric==1){
            return "Monday";
        } else if(numeric==2){
            return "Tuesday";
        }else if(numeric==3){
            return "Wednesday";
        }else if(numeric==4){
            return "Thursday";
        }else if(numeric==5){
            return "Friday";
        }else if(numeric==6){
            return "Saturday";
        }
        else{
            return numeric + " is not day of the week";
        }
    }
}

