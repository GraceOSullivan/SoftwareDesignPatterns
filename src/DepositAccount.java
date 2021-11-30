public class DepositAccount extends BankAccount {
    private final String TYPE="Deposit";

    public DepositAccount(Person accHolder, int accNum, double balance) {
            super(accHolder, accNum, balance);
            }

    @Override
    public String describeAccount() {
            return super.toString() + "\nAccount Type: " + TYPE;
            }
}