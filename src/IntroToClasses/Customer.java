package IntroToClasses;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with all parameters is called.");
        printer();
    }

    public Customer() {
        this("Unknown user", 0.00, "unknown@gmail.com");
        System.out.println("Constructor without any parameters is called.");
        printer();
    }

    public Customer(String name, String email) {
        this(name, 120, email);
        System.out.println("Constructor with 2 parameters is called.");
        printer();
    }
    public void printer(){
        System.out.println("Name : " + name +
                "\nCredit Limit is : " + creditLimit +
                "\nEmail is : " + email);
        System.out.println("______________________________________");
    }
}
