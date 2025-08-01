public class ThreadWithdrawal extends Thread {
    private Bank bank;
    private String name;
    private double amount;

    public ThreadWithdrawal(Bank bank, String name, double amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(name, amount);
    }
}
