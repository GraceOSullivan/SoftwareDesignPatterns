public class BankApplication {
    public static void main(String[] args) {

        Person grace = new Person("Grace", "Killarney");

        BankAccount currentAccount = new CurrentAccount(grace, 1234, 10000.00);
        BankAccount savingsAccount = new SavingsAccount(grace, 1234, 1000.00);

        System.out.println(currentAccount);
        System.out.println(savingsAccount);
    }
}
