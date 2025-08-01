public class DriverMain {
    public static void main(String[] args) {
        Bank obj = new Bank(500.00);

        ThreadWithdrawal w1 = new ThreadWithdrawal(obj, "Withdrawer 1", 100);
        ThreadWithdrawal w2 = new ThreadWithdrawal(obj, "Withdrawer 2", 100);
        ThreadWithdrawal w3 = new ThreadWithdrawal(obj, "Withdrawer 3", 100);
        ThreadWithdrawal w4 = new ThreadWithdrawal(obj, "Withdrawer 4", 100);

        ThreadDeposit d1 = new ThreadDeposit(obj, "Depositor 1", 50);
        ThreadDeposit d2 = new ThreadDeposit(obj, "Depositor 2", 50);
        ThreadDeposit d3 = new ThreadDeposit(obj, "Depositor 3", 50);
        ThreadDeposit d4 = new ThreadDeposit(obj, "Depositor 4", 50);

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
}
