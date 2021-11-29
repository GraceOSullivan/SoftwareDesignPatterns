public abstract class BankAccount {
    private Person accHolder;
    private int accNum;
    protected double balance;
    protected InterestRate interestRate;

    public BankAccount() {
        this(new Person(),0,0);
    }

    public BankAccount(Person accHolder, int accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void getInterestRate(InterestRate interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return accHolder.toString() +  "\nAccount Number: " + accNum + "\nBalance=" + balance;
    }

    public abstract String describeAccount();
}