public abstract class BankAccount {
    private Person accHolder;
    private int accNum;
    protected double balance;

    public BankAccount() {
        this(new Person(),0,0);
    }

    public BankAccount(Person accHolder, int accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
    }

    public String describeAccount() {
        return accHolder.toString() +  "\nAccount Number: " + accNum + "\nBalance=" + balance;
    }
}