public abstract class BankAccount {
    private Person accHolder;
    private int accNum;
    protected double balance;
    private static BankCard bankCard; //When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.

    public BankAccount() {
        this(new Person(),0,0, bankCard);
    }

    public BankAccount(Person accHolder, int accNum, double balance, BankCard bankCard) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return accHolder.toString() +  "\nAccount Number: " + accNum + "\nBalance=" + balance;
    }

    public abstract String describeAccount();
}