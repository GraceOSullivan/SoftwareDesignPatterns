public class SavingsAccount extends BankAccount{
    private final String TYPE="Savings";

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Person accHolder, int accNum, double balance) {
        super(accHolder, accNum, balance);
    }

    @Override
    public String toString() {
        return "Account Type: "+ TYPE+super.toString() + "\n";
    }
}
