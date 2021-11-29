public class InterestApplication {
    public static void main(String[] args) {

        Person grace = new Person("Grace", "Killarney");

        BankAccount currentAccount = new CurrentAccount(grace, 6822, 100.00);
        InterestRate currentAccountInterestRate = new InterestRate();

        double calculatedRate = currentAccountInterestRate.calculateCurrentAccountInterestRate(currentAccount, currentAccount.balance);

        System.out.println(calculatedRate);
    }
}
