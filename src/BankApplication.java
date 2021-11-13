public class BankApplication {
    public static void main(String[] args) {

        Person grace = new Person("Grace", "Killarney");

        BankAccount currentAccount = new GoldenYears(new Student(new CurrentAccount(grace, 1234, 10000.00)));
        BankAccount savingsAccount = new Graduate(new Personal(new SavingsAccount(grace, 1234, 1000.00)));


        System.out.println(currentAccount.describeAccount());
        System.out.println(savingsAccount.describeAccount());
    }
}
