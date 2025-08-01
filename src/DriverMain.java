public class DriverMain {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank(500.00);

        // 4 Withdrawals of $100
        ThreadWithdrawal w1 = new ThreadWithdrawal(bank, "User 1", 100);
        ThreadWithdrawal w2 = new ThreadWithdrawal(bank, "User 2", 100);
        ThreadWithdrawal w3 = new ThreadWithdrawal(bank, "User 3", 100);
        ThreadWithdrawal w4 = new ThreadWithdrawal(bank, "User 4", 100);

        // 4 Deposits of $50
        ThreadDeposit d1 = new ThreadDeposit(bank, "User 5", 50);
        ThreadDeposit d2 = new ThreadDeposit(bank, "User 6", 50);
        ThreadDeposit d3 = new ThreadDeposit(bank, "User 7", 50);
        ThreadDeposit d4 = new ThreadDeposit(bank, "User 8", 50);

        // Run withdrawals
        w1.start(); w1.join();
        w2.start(); w2.join();
        w3.start(); w3.join();
        w4.start(); w4.join();

        // Run deposits
        d1.start(); d1.join();
        d2.start(); d2.join();
        d3.start(); d3.join();
        d4.start(); d4.join();

        System.out.println("Final balance: $" + bank.getBalance());
    }
}
