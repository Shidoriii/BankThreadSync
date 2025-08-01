public class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(String name, double amount) {
        System.out.println(name + " is depositing $" + amount);
        balance += amount;
        System.out.println("Balance after deposit: $" + balance);
    }

    public synchronized void withdraw(String name, double amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println("Balance after withdrawal: $" + balance);
        } else {
            System.out.println(name + " tried to withdraw $" + amount + " but insufficient funds. Current balance: $" + balance);
        }
    }
}
