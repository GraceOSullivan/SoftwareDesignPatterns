public class InterestApplication {
    public static void main(String[] args) {

        Person grace = new Person("Grace", "Killarney");

        BankAccount currentAccount = new CurrentAccount(grace, 6822, 100.00);
        InterestRate currentAccountInterestRate = new CurrentAccountInterestRate();
        System.out.println(currentAccountInterestRate.calculateInterestRate(currentAccount) + "%");

        BankAccount savingsAccount = new SavingsAccount(grace, 6822, 100.00);
        InterestRate savingsAccountInterestRate = new SavingsAccountInterestRate();
        System.out.println(savingsAccountInterestRate.calculateInterestRate(savingsAccount) + "%");

        BankAccount depositAccount = new SavingsAccount(grace, 6822, 100.00);
        InterestRate depositAccountInterestRate = new DepositAccountInterestRate();
        System.out.println(depositAccountInterestRate.calculateInterestRate(depositAccount) + "%");
    }
}
