package Pojo;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("U221006" + i,
                    switch (i) {
                        case 0 -> "Javohir";
                        case 1 -> "Suhrob";
                        case 2 -> "Bobur";
                        case 3 -> "Tim";
                        case 4 -> "John";
                        case 5 -> "Doe";
                        default -> "Unknown";
                    }, switch (i) {
                case 0 -> "2000-01-01";
                case 1 -> "2001-02-02";
                case 2 -> "2004-03-03";
                case 3 -> "2002-03-03";
                case 4 -> "2003-04-04";
                case 5 -> "2004-05-05";
                default -> "Unknown";
            }, "B202"); //this is the usage of pojo!
            System.out.println(s);

        }

        Student pojoStudent = new Student("U2210061", "Suhrob", "2001-02-02", "B202");
        System.out.println(pojoStudent);

        LPAStudent recordStudent = new LPAStudent("U2210061", "Suhrob", "2001-02-02", "B202");
        System.out.println(recordStudent);

    }

}