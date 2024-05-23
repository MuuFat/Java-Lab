public class Lab12 {
    protected double balance;
    public Lab12(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient amount");
        }
    }
    public void transfer(Lab12 other, double amount) {
        if (amount <= this.balance) {
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Insufficient amount");
        }
    }
    public double getBalance() {
        return this.balance;
    }
}

class Savings extends Lab12 {
    private double interest;
    public Savings(double initialBalance, double interest) {
        super(initialBalance);
        this.interest = interest;
    }
    public void addInterest() {
        double balance = this.getBalance();
        double interestAmount = balance * interest / 100;
        this.deposit(interestAmount);
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("Can't do withdraw operation in savings account.");
    }
    @Override
    public void transfer(Lab12 other, double amount) {
        System.out.println("Can't do transfer operation in savings account.");
        System.out.print("\n");
    }
}

class Current extends Lab12 {
    private double limit;
    public Current(double initialBalance, double limit) {
        super(initialBalance);
        this.limit = limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();
        if (amount <= balance + limit) {
            this.balance -= amount;
        } else {
            System.out.println("Exceeded limit");
        }
    }
    @Override
    public void transfer(Lab12 other, double amount) {
        double balance = this.getBalance();
        if (amount <= balance + limit) {
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Exceeded limit");
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Savings savings = new Savings(15000, 15);
        Current current = new Current(7000, 3500);

        System.out.println("Savings : " + savings.getBalance());
        System.out.println("Current : " + current.getBalance());
        System.out.print("\n");

        savings.withdraw(2500);
        savings.transfer(current, 5000);
        savings.addInterest();

        System.out.println("Savings : " + savings.getBalance());
        System.out.println("Current : " + current.getBalance());
        System.out.print("\n");

        current.withdraw(1000);
        current.transfer(savings, 2500);
        current.setLimit(4500);

        System.out.println("Savings : " + savings.getBalance());
        System.out.println("Current : " + current.getBalance());
        System.out.print("\n");
    }
}

