public abstract class BankAccount {
    private Person accHolder;
    private int accNum;
    protected double balance;
    private static BankCard bankCard; //static so can be accessed before BankCard object created and without reference to any object.

    public BankAccount() {
        this(new Person(),0,0, bankCard);
    }

    public BankAccount(Person accHolder, int accNum, double balance, BankCard bankCard) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
        this.bankCard = bankCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amountDeposited){
        if(amountDeposited > 0){
            double balance = getBalance();
            balance += amountDeposited;
            setBalance(balance);
        }else
            System.out.println("Amount to deposit must be greater than 0");
    }

    public void withdraw(double amountWithdrawn){
        if(amountWithdrawn > 0){
            double balance = getBalance();
            balance -= amountWithdrawn;
            setBalance(balance);
        }else
            System.out.println("Amount to withdraw must be greater than 0");
    }


    @Override
    public String toString() {
        return accHolder.toString() +  "\nAccount Number: " + accNum + "\nBalance=" + balance;
    }

    public abstract String describeAccount();
}