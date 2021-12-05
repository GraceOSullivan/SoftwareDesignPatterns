public class CurrentAccount extends BankAccount {
    private final String TYPE="Current";

    public CurrentAccount(Person accHolder, int accNum, double balance, BankCard bankCard) {
        super(accHolder, accNum, balance, bankCard);
    }

    @Override
    public String describeAccount() {
        return super.toString() + "\nAccount Type: " + TYPE;
    }
}
