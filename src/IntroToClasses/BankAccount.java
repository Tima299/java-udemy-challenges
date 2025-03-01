package IntroToClasses;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
        System.out.println("__________________________________________");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters called");
        System.out.println("__________________________________________");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money) {
        balance += money;
        System.out.println("Within account number " + accountNumber +
                "\nMr or miss " + customerName +
                "\nwhose email is " + email +
                "\n and phone number is " + phoneNumber +
                "\ndeposited " + money + "$ " +
                "\n now in his or her balance there is " + balance + "$");
        System.out.println("__________________________________________");
    }

    public void withdrawFunds(double money) {
        if (balance < money) {
            System.out.println("Insufficient funds to withdraw " + money + "$\n" +
                    "Your balance is " + this.balance + "$");
            System.out.println("__________________________________________");
            return;
        }
        balance -= money;
        System.out.println("Within account number " + accountNumber +
                "\nMr or miss " + customerName +
                "\nwhose email is " + email +
                "\n and phone number is " + phoneNumber +
                "\n withdrawing " + money + "$ " +
                "\n now in his or her balance there is " + balance + "$");
        System.out.println("__________________________________________");
    }
}

