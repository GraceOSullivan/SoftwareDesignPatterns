public class SavingsAccount extends BankAccount{
    private final String TYPE="Savings";

    public SavingsAccount(Person accHolder, int accNum, double balance) {
        super(accHolder, accNum, balance);
    }

    @Override
    public String describeAccount() {
        return super.describeAccount() + "\nAccount Type: " + TYPE;
    }
}
