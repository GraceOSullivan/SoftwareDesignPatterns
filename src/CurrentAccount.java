public class CurrentAccount extends BankAccount {
    private final String TYPE="Current";

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(Person accHolder, int accNum, double balance) {
        super(accHolder, accNum, balance);
    }
    @Override
    public String toString() {
        return "\nAccount Type: " + TYPE + super.toString();
    }
}
