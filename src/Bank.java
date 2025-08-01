public class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Bank opened with balance: $" + balance);
    }

    public synchronized void deposit(String name, double amount) {
        System.out.println(name + " is depositing $" + amount);
        balance += amount;
        System.out.println("New balance: $" + balance);
    }

    public synchronized void withdraw(String name, double amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println(name + " attempted to withdraw $" + amount + " but has insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
