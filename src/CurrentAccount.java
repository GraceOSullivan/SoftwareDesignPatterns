public class CurrentAccount extends BankAccount {
    private final String TYPE="Current";

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(Person accHolder, int accNum, double balance) {
        super(accHolder, accNum, balance);
    }
    @Override
    public String describeAccount() {
        return "\nAccount Type: " + TYPE + super.describeAccount() + "\n";
    }
}
