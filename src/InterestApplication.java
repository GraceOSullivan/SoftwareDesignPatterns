public class InterestApplication {
    public static void main(String[] args) {

        Person grace = new Person("Grace", "Killarney");

        BankAccount currentAccount = new CurrentAccount(grace, 6822, 100.00);
        InterestRate currentAccountInterestRate = new InterestRate();
        System.out.println(currentAccountInterestRate.calculateInterestRate(currentAccount) + "%");

        BankAccount savingsAccount = new SavingsAccount(grace, 6822, 100.00);
        InterestRate savingsAccountInterestRate = new InterestRate();
        System.out.println(savingsAccountInterestRate.calculateInterestRate(savingsAccount) + "%");
    }
}
