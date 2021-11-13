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

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                accHolder.toString() +
                        "\nAccount Number: " + accNum +
                        "\nBalance=" + balance;
    }
}