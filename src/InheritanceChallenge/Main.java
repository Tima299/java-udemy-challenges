package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "22/04/2004",  "01/01/2020");
        printEmployee(tim);
        printGetAge(tim);
        printCollectPay(tim);

        SalariedEmployee Sam = new SalariedEmployee("Sam", "30/04/2005",  "12/12/2024", 12000);
        printEmployee(Sam);
        printGetAge(Sam);
        printCollectPay(Sam);
        Sam.retire();
        printPensionCheck(Sam);

        HourlyEmployee mary = new HourlyEmployee("Mary", "22/04/2004",  "01/01/2020", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck is " + mary.collectPay());
        System.out.println("Mary's Holiday Pay is " + mary.getDoublePay());
    }
    public static void printEmployee(Employee employee) {
        System.out.println(employee);
    }
    public static void printGetAge(Worker worker) {
        System.out.println(worker.getName() + "'s Age is " + worker.getAge());
    }
    public static void printCollectPay(Worker worker) {
        System.out.println(worker.getName() + "'s Pay is " + worker.collectPay());
    }
    public static void printPensionCheck(SalariedEmployee salariedEmployee) {
        salariedEmployee.retire();
        System.out.println(salariedEmployee.getName() + " is retired and will receive a pension check of " + salariedEmployee.collectPay());
    }
}